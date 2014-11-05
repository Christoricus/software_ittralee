using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.OracleClient;


namespace ListStock_2
{
    public partial class frmListStock : Form
    {
        string oradb = "Data Source=Oracle;User Id=TNNNNNNNN;Password=XXXXXXXX;";
        string strSQL = "";

        public frmListStock()
        {
            InitializeComponent();
        }

        private void frmListStock_Load(object sender, EventArgs e)
        {
            //display current date on form
            lblDate.Text = DateTime.Today.ToString("dd/MM/yyyy");

            //Fill grid in order of StockNo
            FillGrid("StockNo"); 
        }

        private void FillGrid(string sortOrder)
        {
            
            try
            {
                OracleConnection conn = new OracleConnection(oradb);

                //define SQL query
                strSQL = "SELECT StockNo, Description, Qty FROM Stock ORDER BY " + sortOrder;

                OracleCommand cmd = new OracleCommand(strSQL, conn);
                cmd.CommandType = CommandType.Text;
                OracleDataAdapter da = new OracleDataAdapter(cmd);
                DataSet ds = new DataSet();
                da.Fill(ds, "ss");
                grdStock.DataSource = ds.Tables["ss"];
                // dataGridView1.DataBind();
            }
            catch (OracleException ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void optStockNo_Click(object sender, EventArgs e)
        {
            FillGrid("StockNo");
        }

        private void optDesc_Click(object sender, EventArgs e)
        {
            FillGrid("Description");
        }

        private void optSalePrice_Click(object sender, EventArgs e)
        {
            FillGrid("SalePrice");
        }

        private void grdStock_CellClick(object sender, DataGridViewCellEventArgs e)
        {

            //set column index on grid to 0 and retrieve cell value
     
            string strSno = grdStock.Rows[grdStock.CurrentCell.RowIndex].Cells[0].Value.ToString();



            //using StockNo selected in grid, retrieve details for this stock item
             getStock(strSno);

            grpStock.Visible = true;
           //grdStock.Rows[grdStock.CurrentCell.RowIndex].Cells[0].Value);
            //txtStockNo.Text = grdStock.Rows[grdStock.CurrentCell.RowIndex].Cells[0].Value.ToString();
            //txtStockNo.Text = grdStock.Rows[grdStock.CurrentCell.RowIndex].Cells[grdStock.CurrentCell.ColumnIndex].Value.ToString();

         
        }

        private void getStock(string sno)
        {
            try
            {
                OracleConnection conn = new OracleConnection(oradb);
                conn.Open();
                OracleCommand cmd = conn.CreateCommand();

                //define SQL query
                strSQL = "SELECT * FROM Stock WHERE StockNo = " + sno;
                cmd.CommandText = strSQL;
                OracleDataReader dr = cmd.ExecuteReader();
                
                dr.Read();

                txtStockNo.Text = dr.GetValue(0).ToString();
                txtDesc.Text = dr.GetValue(1).ToString();
                txtCostPrice.Text = dr.GetValue(2).ToString();
                txtSalePrice.Text = dr.GetValue(3).ToString();
                txtQty.Text = dr.GetValue(4).ToString();

                //display the details on the form
                grpStock.Visible = true;
            }
            catch
            {
                MessageBox.Show("No Record Found");
            }
        }

        private void grdStock_Click(object sender, EventArgs e)
        {

        }

        private void btnAmend_Click(object sender, EventArgs e)
        {
            //validate input
            if (txtDesc.Text == "")
            {
                MessageBox.Show("This field must be entered", "Error!", MessageBoxButtons.OK, MessageBoxIcon.Error);
                txtDesc.Focus();

            }

            //Connect to Database
            OracleConnection conn = new OracleConnection(oradb);
            conn.Open();
            OracleCommand cmd = conn.CreateCommand();

            //Define SQL Query (UPDATE)
            strSQL = "UPDATE Stock SET Description = '" + txtDesc.Text +
                "', CostPrice = " + txtCostPrice.Text +
                ", SalePrice = " + txtSalePrice.Text + " WHERE StockNo = " + txtStockNo.Text; 
            
            cmd.CommandText = strSQL;

            //Execute SQL Query
            cmd.ExecuteNonQuery();

            //Close Database
            conn.Close();

            //Display confirmation message
            MessageBox.Show("Stock Updated", "Confirmation", MessageBoxButtons.OK, MessageBoxIcon.Information);
            FillGrid("StockNo");
            //Clear the form
            grpStock.Visible = false;

        }


    }
}
