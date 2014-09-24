namespace ListStock_2
{
    partial class frmListStock
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.grdStock = new System.Windows.Forms.DataGridView();
            this.grpOrder = new System.Windows.Forms.GroupBox();
            this.optSalePrice = new System.Windows.Forms.RadioButton();
            this.optDesc = new System.Windows.Forms.RadioButton();
            this.optStockNo = new System.Windows.Forms.RadioButton();
            this.lblDate = new System.Windows.Forms.Label();
            this.grpStock = new System.Windows.Forms.GroupBox();
            this.txtSalePrice = new System.Windows.Forms.TextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.txtCostPrice = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.txtQty = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.txtDesc = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.txtStockNo = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.btnAmend = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.grdStock)).BeginInit();
            this.grpOrder.SuspendLayout();
            this.grpStock.SuspendLayout();
            this.SuspendLayout();
            // 
            // grdStock
            // 
            this.grdStock.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.grdStock.Location = new System.Drawing.Point(27, 73);
            this.grdStock.Name = "grdStock";
            this.grdStock.Size = new System.Drawing.Size(374, 154);
            this.grdStock.TabIndex = 0;
            this.grdStock.CellClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.grdStock_CellClick);
            this.grdStock.Click += new System.EventHandler(this.grdStock_Click);
            // 
            // grpOrder
            // 
            this.grpOrder.Controls.Add(this.optSalePrice);
            this.grpOrder.Controls.Add(this.optDesc);
            this.grpOrder.Controls.Add(this.optStockNo);
            this.grpOrder.Location = new System.Drawing.Point(27, 16);
            this.grpOrder.Name = "grpOrder";
            this.grpOrder.Size = new System.Drawing.Size(328, 51);
            this.grpOrder.TabIndex = 1;
            this.grpOrder.TabStop = false;
            this.grpOrder.Text = "Specify Sort Order";
            // 
            // optSalePrice
            // 
            this.optSalePrice.AutoSize = true;
            this.optSalePrice.Location = new System.Drawing.Point(237, 22);
            this.optSalePrice.Name = "optSalePrice";
            this.optSalePrice.Size = new System.Drawing.Size(73, 17);
            this.optSalePrice.TabIndex = 2;
            this.optSalePrice.Text = "Sale Price";
            this.optSalePrice.UseVisualStyleBackColor = true;
            this.optSalePrice.Click += new System.EventHandler(this.optSalePrice_Click);
            // 
            // optDesc
            // 
            this.optDesc.AutoSize = true;
            this.optDesc.Location = new System.Drawing.Point(120, 23);
            this.optDesc.Name = "optDesc";
            this.optDesc.Size = new System.Drawing.Size(78, 17);
            this.optDesc.TabIndex = 1;
            this.optDesc.Text = "Description";
            this.optDesc.UseVisualStyleBackColor = true;
            this.optDesc.Click += new System.EventHandler(this.optDesc_Click);
            // 
            // optStockNo
            // 
            this.optStockNo.AutoSize = true;
            this.optStockNo.Checked = true;
            this.optStockNo.Location = new System.Drawing.Point(12, 22);
            this.optStockNo.Name = "optStockNo";
            this.optStockNo.Size = new System.Drawing.Size(70, 17);
            this.optStockNo.TabIndex = 0;
            this.optStockNo.TabStop = true;
            this.optStockNo.Text = "Stock No";
            this.optStockNo.UseVisualStyleBackColor = true;
            this.optStockNo.Click += new System.EventHandler(this.optStockNo_Click);
            // 
            // lblDate
            // 
            this.lblDate.AutoSize = true;
            this.lblDate.Location = new System.Drawing.Point(379, 22);
            this.lblDate.Name = "lblDate";
            this.lblDate.Size = new System.Drawing.Size(35, 13);
            this.lblDate.TabIndex = 2;
            this.lblDate.Text = "label1";
            // 
            // grpStock
            // 
            this.grpStock.Controls.Add(this.btnAmend);
            this.grpStock.Controls.Add(this.txtSalePrice);
            this.grpStock.Controls.Add(this.label5);
            this.grpStock.Controls.Add(this.txtCostPrice);
            this.grpStock.Controls.Add(this.label4);
            this.grpStock.Controls.Add(this.txtQty);
            this.grpStock.Controls.Add(this.label3);
            this.grpStock.Controls.Add(this.txtDesc);
            this.grpStock.Controls.Add(this.label2);
            this.grpStock.Controls.Add(this.txtStockNo);
            this.grpStock.Controls.Add(this.label1);
            this.grpStock.ForeColor = System.Drawing.Color.Red;
            this.grpStock.Location = new System.Drawing.Point(29, 233);
            this.grpStock.Name = "grpStock";
            this.grpStock.Size = new System.Drawing.Size(371, 150);
            this.grpStock.TabIndex = 3;
            this.grpStock.TabStop = false;
            this.grpStock.Text = "Selected Stock Details";
            this.grpStock.Visible = false;
            // 
            // txtSalePrice
            // 
            this.txtSalePrice.Location = new System.Drawing.Point(77, 112);
            this.txtSalePrice.Name = "txtSalePrice";
            this.txtSalePrice.Size = new System.Drawing.Size(41, 20);
            this.txtSalePrice.TabIndex = 9;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.ForeColor = System.Drawing.Color.Black;
            this.label5.Location = new System.Drawing.Point(14, 118);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(55, 13);
            this.label5.TabIndex = 8;
            this.label5.Text = "Sale Price";
            // 
            // txtCostPrice
            // 
            this.txtCostPrice.Location = new System.Drawing.Point(77, 82);
            this.txtCostPrice.Name = "txtCostPrice";
            this.txtCostPrice.Size = new System.Drawing.Size(41, 20);
            this.txtCostPrice.TabIndex = 7;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.ForeColor = System.Drawing.Color.Black;
            this.label4.Location = new System.Drawing.Point(14, 88);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(55, 13);
            this.label4.TabIndex = 6;
            this.label4.Text = "Cost Price";
            // 
            // txtQty
            // 
            this.txtQty.Enabled = false;
            this.txtQty.Location = new System.Drawing.Point(303, 43);
            this.txtQty.Name = "txtQty";
            this.txtQty.Size = new System.Drawing.Size(41, 20);
            this.txtQty.TabIndex = 5;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.ForeColor = System.Drawing.Color.Black;
            this.label3.Location = new System.Drawing.Point(251, 50);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(46, 13);
            this.label3.TabIndex = 4;
            this.label3.Text = "Quantity";
            // 
            // txtDesc
            // 
            this.txtDesc.Location = new System.Drawing.Point(77, 47);
            this.txtDesc.MaxLength = 20;
            this.txtDesc.Name = "txtDesc";
            this.txtDesc.Size = new System.Drawing.Size(150, 20);
            this.txtDesc.TabIndex = 3;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.ForeColor = System.Drawing.Color.Black;
            this.label2.Location = new System.Drawing.Point(14, 54);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(60, 13);
            this.label2.TabIndex = 2;
            this.label2.Text = "Description";
            // 
            // txtStockNo
            // 
            this.txtStockNo.Enabled = false;
            this.txtStockNo.Location = new System.Drawing.Point(77, 20);
            this.txtStockNo.Name = "txtStockNo";
            this.txtStockNo.Size = new System.Drawing.Size(41, 20);
            this.txtStockNo.TabIndex = 1;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.ForeColor = System.Drawing.Color.Black;
            this.label1.Location = new System.Drawing.Point(14, 24);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(52, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Stock No";
            // 
            // btnAmend
            // 
            this.btnAmend.Location = new System.Drawing.Point(294, 118);
            this.btnAmend.Name = "btnAmend";
            this.btnAmend.Size = new System.Drawing.Size(59, 31);
            this.btnAmend.TabIndex = 10;
            this.btnAmend.Text = "Amend";
            this.btnAmend.UseVisualStyleBackColor = true;
            this.btnAmend.Click += new System.EventHandler(this.btnAmend_Click);
            // 
            // frmListStock
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(434, 431);
            this.Controls.Add(this.grpStock);
            this.Controls.Add(this.lblDate);
            this.Controls.Add(this.grpOrder);
            this.Controls.Add(this.grdStock);
            this.Name = "frmListStock";
            this.Text = "List Stock - With Sort Order";
            this.Load += new System.EventHandler(this.frmListStock_Load);
            ((System.ComponentModel.ISupportInitialize)(this.grdStock)).EndInit();
            this.grpOrder.ResumeLayout(false);
            this.grpOrder.PerformLayout();
            this.grpStock.ResumeLayout(false);
            this.grpStock.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.DataGridView grdStock;
        private System.Windows.Forms.GroupBox grpOrder;
        private System.Windows.Forms.RadioButton optSalePrice;
        private System.Windows.Forms.RadioButton optDesc;
        private System.Windows.Forms.RadioButton optStockNo;
        private System.Windows.Forms.Label lblDate;
        private System.Windows.Forms.GroupBox grpStock;
        private System.Windows.Forms.TextBox txtSalePrice;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox txtCostPrice;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox txtQty;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox txtDesc;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox txtStockNo;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button btnAmend;
    }
}

