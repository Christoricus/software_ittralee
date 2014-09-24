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
    public partial class frmSelect : Form
    {
        string strSQL = "";
        string oradb = "Data Source=Oracle;User Id=LECCW;Password=123456;";
        OracleConnection conn; 

        public frmSelect()
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
                 //define SQL query
                strSQL = "SELECT StockNo, Description, Qty FROM Stock ORDER BY " + sortOrder;

                conn = new OracleConnection(oradb);

                OracleCommand cmd = new OracleCommand(strSQL, conn);
                cmd.CommandType = CommandType.Text;
                OracleDataAdapter da = new OracleDataAdapter(cmd);
                DataSet ds = new DataSet();
                da.Fill(ds, "ss");
                grdStock.DataSource = ds.Tables["ss"];
            }
            catch
            {
                MessageBox.Show("No Record Found");
            }
            //close database connection
            conn.Close();
        }

        //fill datagridview in order specified by user
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

            //make selected stock details visible
            grpStock.Visible = true;
                   
        }

        private void getStock(string sno)
        {
            try
            {
                //define SQL query
                strSQL = "SELECT * FROM Stock WHERE StockNo = " + sno;


                //OracleConnection conn = new OracleConnection(oradb);
                conn = new OracleConnection(oradb);
                conn.Open();
                OracleCommand cmd = conn.CreateCommand();

                //define SQL query
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
            catch (OracleException ex)
            {
                MessageBox.Show(ex.Message);
            }
        }
    }
}
