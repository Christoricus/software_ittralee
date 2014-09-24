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
            string oradb = "Data Source=Oracle;User Id=LECCW;Password=123456;";
            try
            {
                OracleConnection conn = new OracleConnection(oradb);

                //define SQL query
                string strSQL = "SELECT * FROM Stock ORDER BY " + sortOrder;

                OracleCommand cmd = new OracleCommand(strSQL, conn);
                cmd.CommandType = CommandType.Text;
                OracleDataAdapter da = new OracleDataAdapter(cmd);
                DataSet ds = new DataSet();
                da.Fill(ds, "ss");
                grdStock.DataSource = ds.Tables["ss"];
                // dataGridView1.DataBind();
            }
            catch
            {
                MessageBox.Show("No Record Found");
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

    }
}
