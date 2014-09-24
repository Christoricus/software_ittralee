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
            ((System.ComponentModel.ISupportInitialize)(this.grdStock)).BeginInit();
            this.grpOrder.SuspendLayout();
            this.SuspendLayout();
            // 
            // grdStock
            // 
            this.grdStock.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.grdStock.Location = new System.Drawing.Point(22, 94);
            this.grdStock.Name = "grdStock";
            this.grdStock.Size = new System.Drawing.Size(622, 154);
            this.grdStock.TabIndex = 0;
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
            // frmListStock
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(656, 285);
            this.Controls.Add(this.lblDate);
            this.Controls.Add(this.grpOrder);
            this.Controls.Add(this.grdStock);
            this.Name = "frmListStock";
            this.Text = "List Stock - With Sort Order";
            this.Load += new System.EventHandler(this.frmListStock_Load);
            ((System.ComponentModel.ISupportInitialize)(this.grdStock)).EndInit();
            this.grpOrder.ResumeLayout(false);
            this.grpOrder.PerformLayout();
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
    }
}

