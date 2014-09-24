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
//using Oracle.DataAccess.Client; // ODP.NET Oracle managed provider
//using Oracle.DataAccess.Types;

namespace FirstClass
{
 

    public partial class frmStockList : Form
    {
        public frmStockList()
        {
            InitializeComponent();
        }

        private void frmStockList_Load(object sender, EventArgs e)
        {
            lblDate.Text = DateTime.Today.ToString("dd/MM/yyyy");

            //DateTime today = DateTime.Today;
            //lblDate.Text = today.ToString();

            string oradb = "Data Source=Oracle;User Id=LECCW;Password=123456;";
            try
            {
                OracleConnection conn = new OracleConnection(oradb);
                //connection name conn.Open();
                OracleCommand cmd = new OracleCommand("SELECT StockNo, Description FROM Stock ORDER BY Description", conn);
                cmd.CommandType = CommandType.Text;
                OracleDataAdapter da = new OracleDataAdapter(cmd);
                DataSet ds = new DataSet();   
                da.Fill(ds, "ss");     
                grdStock.DataSource = ds.Tables["ss"];
                // dataGridView1.DataBind();
            }            
            catch  (OracleException ex)          
            {              
                MessageBox.Show(ex.Message);
            }
        }

        private void grdStock_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }              
    }
}
