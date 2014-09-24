using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace FirstClass
{
    public partial class Form2 : Form
    {
        Form1 parent;

        public Form2(Form1 Parent)
        {
            parent = Parent;
            InitializeComponent();
        }


        private void btnForm2_Click(object sender, EventArgs e)
        {


            parent.Visible = true;
            this.Close();
            
        }

    }
}
