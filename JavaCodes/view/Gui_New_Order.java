/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;





public class Gui_New_Order extends javax.swing.JFrame {

    /**
     * Creates new form Gui_New_Order
     */
	DefaultTableModel model;
    
    public Gui_New_Order() {
        initComponents();
        model = (DefaultTableModel)jTable_order.getModel();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton_hot_beverage = new javax.swing.JButton();
        jButton_cold_beverage = new javax.swing.JButton();
        jButton_quick_bites = new javax.swing.JButton();
        jButton_shakes = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox_items = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel_unit_price = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_quantity = new javax.swing.JTextField();
        jButton_add = new javax.swing.JButton();
        jButton_edit = new javax.swing.JButton();
        jButton_remove = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jCheckBox_online = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_order = new javax.swing.JTable();
        jButton_add_to_queue = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel_total = new javax.swing.JLabel();
        jLabel_discount = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel_warning_msg = new javax.swing.JLabel();
        jButton_new_order = new javax.swing.JButton();
        jButton_view = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        setLocation(new java.awt.Point(0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Cafe Coffee Beans");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(276, 276, 276))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Categories");

        jButton_hot_beverage.setText("Hot Beverages");
        jButton_cold_beverage.setText("Cold Beverages");
        jButton_quick_bites.setText("Quick Bites");
        jButton_shakes.setText("Shakes");


        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_hot_beverage, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_quick_bites, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_shakes, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_cold_beverage, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_cold_beverage)
                    .addComponent(jButton_hot_beverage, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_shakes)
                    .addComponent(jButton_quick_bites))
                .addGap(0, 62, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel3.setText("Select Item");

        jComboBox_items.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"--Select a category--" }));

        jLabel4.setText("Unit Price");

        jLabel_unit_price.setText(" ");

        jLabel6.setText("Quantity");
        jButton_add.setText("Add");
        jButton_edit.setText("Edit");
        jButton_remove.setText("Remove");

        jLabel11.setText("Online Order");


        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jButton_add, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addGap(60, 60, 60)
                            .addComponent(jButton_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(63, 63, 63)
                            .addComponent(jButton_remove))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField_quantity))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox_items, 0, 249, Short.MAX_VALUE)
                                .addComponent(jLabel_unit_price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox_online)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox_items, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel_unit_price))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jCheckBox_online))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_add)
                    .addComponent(jButton_edit)
                    .addComponent(jButton_remove))
                .addGap(23, 23, 23))
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTable_order.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                
            },
            new String [] {
                "#No", "Item", "Unit Price", "Quantity", "Amount"
            }
        ) );
        jTable_order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_orderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_order);

        jButton_add_to_queue.setText("Confirm Order");


        jLabel7.setText("Total");

        jLabel8.setText("Discount");

        jLabel_total.setText(" ");

        jLabel_discount.setText(" ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(562, 562, 562)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel_discount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(156, 156, 156))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel_total, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jButton_add_to_queue)))
                .addGap(0, 50, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel_total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel_discount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_add_to_queue)
                .addGap(24, 24, 24))
        );

        jLabel_warning_msg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel_warning_msg.setForeground(new java.awt.Color(204, 0, 102));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_warning_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel_warning_msg)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jButton_new_order.setText("New Order");
        jButton_view.setText("Update Staff / View Status");


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jButton_new_order, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton_view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGap(58, 58, 58)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 18, Short.MAX_VALUE)))
                    .addContainerGap())
            );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(60, 60, 60)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(36, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton_new_order)
                                .addComponent(jButton_view))
                            .addGap(28, 28, 28))))
            );

        pack();
    }// </editor-fold>                        

     
    public void setPrice(String price)
    {
    	jLabel_unit_price.setText(price);
    }
    public void setFillItems(List<String> list)
    {
    	DefaultComboBoxModel<String> df = new DefaultComboBoxModel<String>();
    	for(String str: list) {
    		df.addElement(str);
    	}
    	jComboBox_items.setModel(df);
    }
    public String getComboItem()
    {
    	return jComboBox_items.getSelectedItem().toString();	
    }
    public boolean getOnlineStatus()
    {
    	return jCheckBox_online.isSelected();
    }
    public void removeItems()
    {
    	try{model.removeRow(jTable_order.getSelectedRow());}catch(Exception e) {}
        jTextField_quantity.setText(null);
        for(int i=0;i<model.getRowCount();i++)
        {
        	model.setValueAt(i+1, i, 0);
        }
    }
    public void defaultQuantity()
    {
    	jTextField_quantity.setText("1");
    }
    public void newOrder()
    {
    	jTextField_quantity.setText(null);
        jLabel_total.setText(null);
        jLabel_discount.setText(null);
        model.setRowCount(0);
    }
    public void editPerformed()
    {
    	try
    	{
        int x = Integer.parseInt((String) jTextField_quantity.getText());
    	if(x < 10 ) {
    		model.setValueAt(jTextField_quantity.getText(), jTable_order.getSelectedRow(),3);
       	}
    	else {
    		jLabel_warning_msg.setText("Quantity should be less than 10!!!");
    		jTextField_quantity.setText(null);
    	}
    	}
    	catch(Exception e) {}
    }
    
    public String getRowValueOf(int row,int col)
    {
    	return (String)jTable_order.getValueAt(row, col);
    }
    public int getOrderRowCount()
    {
    	return jTable_order.getRowCount();
    }
    public void hotBevListener(ActionListener listenForButton)
    {
    	jButton_hot_beverage.addActionListener(listenForButton);
    }
    public void coldBevListener(ActionListener listenForButton)
    {
    	jButton_cold_beverage.addActionListener(listenForButton);
    }
    public void shakeListener(ActionListener listenForButton)
    {
    	jButton_shakes.addActionListener(listenForButton);
    }
    public void quickBiteListener(ActionListener listenForButton)
    {
    	jButton_quick_bites.addActionListener(listenForButton);
    }
    public void addListener(ActionListener listenForButton)
    {
    	jButton_add.addActionListener(listenForButton);
    }
    public void addQueueListener(ActionListener listenForButton)
    {
    	jButton_add_to_queue.addActionListener(listenForButton);
    }
    public void editListener(ActionListener listenForButton)
    {
    	jButton_edit.addActionListener(listenForButton);
    }
    public void newOrderListener(ActionListener listenForButton)
    {
    	jButton_new_order.addActionListener(listenForButton);
    }
    public void removeListener(ActionListener listenForButton)
    {
    	jButton_remove.addActionListener(listenForButton);
    }
    public void view_staff_Listener(ActionListener listenForButton)
    {
    	jButton_view.addActionListener(listenForButton);
    }
   public void checkStatusListener(ActionListener listenForCheck)
   {
	   jCheckBox_online.addActionListener(listenForCheck);
   }
   public void comboListener(ActionListener listenForItems)
   {
	   jComboBox_items.addActionListener(listenForItems);
   }
   public void windowListener(WindowListener listenForClose)
   {
	   this.addWindowListener(listenForClose);
   }
  
                                        
                                             

   public void addNewLine() {                                            
    	int x;
    	jLabel_total.setText(null);
        jLabel_discount.setText(null);
    	try {
    		x = Integer.parseInt((String) jTextField_quantity.getText());
    	}
    	catch(Exception e) {
    		x = 1;
    	}
    	if(jComboBox_items.getSelectedItem()!="--Select a category--")
    	{
    	if(x < 10 ) {
            model.insertRow(model.getRowCount(),new Object[]{model.getRowCount()+1,
            		jComboBox_items.getSelectedItem(),
            		jLabel_unit_price.getText(),
            		Integer.toString(x)});
       	}
    	else {
    		jLabel_warning_msg.setText("Quantity should be less than 10!!!");
    		jTextField_quantity.setText(null);
    	}
    	}
    	jTextField_quantity.setText(null);

    }                                                                                  
    
    private void jTable_orderMouseClicked(java.awt.event.MouseEvent evt) {                                          
    	jComboBox_items.setSelectedItem(model.getValueAt(jTable_order.getSelectedRow(), 1));
        jLabel_unit_price.setText(model.getValueAt(jTable_order.getSelectedRow(), 2).toString());
        jTextField_quantity.setText(model.getValueAt(jTable_order.getSelectedRow(), 3).toString());
    } 
      
    private void jButton_viewActionPerformed(java.awt.event.ActionEvent evt) {                                             
        Gui_2 view = new Gui_2();
        view.setVisible(true);
    }

    public void setTotal(String amt)
    {
    	jLabel_total.setText(amt);
    }
    public void setDiscount(String discount)
    {
    	jLabel_discount.setText(discount);
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_add_to_queue;
    private javax.swing.JButton jButton_cold_beverage;
    private javax.swing.JButton jButton_edit;
    private javax.swing.JButton jButton_hot_beverage;
    private javax.swing.JButton jButton_new_order;
    private javax.swing.JButton jButton_view;
    private javax.swing.JButton jButton_quick_bites;
    private javax.swing.JButton jButton_remove;
    private javax.swing.JButton jButton_shakes;
    private javax.swing.JCheckBox jCheckBox_online;
    private javax.swing.JComboBox<String> jComboBox_items;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_discount;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_total;
    private javax.swing.JLabel jLabel_unit_price;
    private javax.swing.JLabel jLabel_warning_msg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_order;
    private javax.swing.JTextField jTextField_quantity;
    // End of variables declaration                   
}
//jButton_remove.addActionListener(new java.awt.event.ActionListener() {
//    public void actionPerformed(java.awt.event.ActionEvent evt) {
//        jButton_removeActionPerformed(evt);
//    }
//});
