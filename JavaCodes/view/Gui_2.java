/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;
import java.util.*;
import model.*;

public class Gui_2 extends javax.swing.JFrame {

    /**model_order
     * Creates new form Gui_1
     */
    DefaultTableModel model_order;
    public Gui_2() {
        initComponents();
        DateTime();
        model_order = (DefaultTableModel)jTable_order_status.getModel();
        
        //waiter name collection
        jComboBox_delete_waiter.removeAllItems();      
    	jComboBox_delete_cook.removeAllItems();
    	
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_datetime = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox_delete_cook = new javax.swing.JComboBox<>();
        jComboBox_delete_waiter = new javax.swing.JComboBox<>();
        jButton_delete_waiter = new javax.swing.JButton();
        jButton_add_cook = new javax.swing.JButton();
        jTextField_add_waiter = new javax.swing.JTextField();
        jTextField_add_cook = new javax.swing.JTextField();
        jButton_add_waiter = new javax.swing.JButton();
        jButton_delete_cook = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_order_status = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox_prep_time = new javax.swing.JComboBox<>();
        jComboBox_new_order_time = new javax.swing.JComboBox<>();
        jButton_prep_time = new javax.swing.JButton();
        jButton_new_order = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Update Staff / View Processing Information");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(508, 508, 508)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel_datetime.setText("<datetime>");

        jLabel2.setBackground(new java.awt.Color(0, 204, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Waiter");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Cook");

        jComboBox_delete_cook.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"--Select a Cook--" }));

        jComboBox_delete_waiter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select a Waiter--" }));

        jButton_delete_waiter.setText("Delete");
        jButton_add_cook.setText("Add Cook");
        jButton_add_waiter.setText("Add Waiter");
        jButton_delete_cook.setText("Delete");
       


       

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_datetime))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboBox_delete_waiter, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_delete_waiter))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboBox_delete_cook, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_delete_cook)))
                .addGap(130, 130, 130)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField_add_cook, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_add_cook, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField_add_waiter, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_add_waiter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_datetime)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox_delete_waiter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_delete_waiter)
                    .addComponent(jTextField_add_waiter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_add_waiter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox_delete_cook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_add_cook)
                    .addComponent(jTextField_add_cook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_delete_cook))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Order Status");

        jTable_order_status.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                
            },
            new String [] {
                "Order Id", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_order_status);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.Y_AXIS));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Waiter Processing Status");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel4.add(jLabel5);

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.Y_AXIS));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Cook Preparing Status");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel5.add(jLabel6);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Alter Simulation Speed");

        jLabel8.setText("Extend Preparation Time");

        jLabel9.setText("New Order Lead Time");

        jComboBox_prep_time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5","10","15" }));

        jComboBox_new_order_time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5","10","15" }));

        jButton_prep_time.setText("Apply");
        jButton_new_order.setText("Apply");


        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox_new_order_time, 0, 132, Short.MAX_VALUE)
                            .addComponent(jComboBox_prep_time, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_new_order, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_prep_time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox_prep_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_prep_time)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox_new_order_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_new_order))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents




    public void load_each_waiter(String waiter_name)
    {
    	Waiter_Results resultsPanel = new Waiter_Results();
        resultsPanel.layoutWaiterResults(waiter_name);
        jPanel4.add(resultsPanel, BorderLayout.EAST);
        resultsPanel.setVisible(true);
        getContentPane().repaint();
        getContentPane().revalidate();
        
        /* Loading waiter combobox */
        jComboBox_delete_waiter.addItem(waiter_name);
    }
    public void load_each_cook(String cook_name)
    {
    	/* Loading cook subpanels */
        Cook_Results cook_resultsPanel = new Cook_Results();
        cook_resultsPanel.layoutCookResults(cook_name);
        jPanel5.add(cook_resultsPanel, BorderLayout.EAST);
        cook_resultsPanel.setVisible(true);
        getContentPane().repaint();
        getContentPane().revalidate();
        
        /* Loading cook combo box */
        jComboBox_delete_cook.addItem(cook_name);
    }
    public void add_cook_tolist(String cook_name)
    {
    	jComboBox_delete_cook.addItem(cook_name);
    }
    public void add_waiter_tolist(String waiter_name)
    {
    	jComboBox_delete_waiter.addItem(waiter_name);
    }
    public String get_new_cook()
    {
    	return jTextField_add_cook.getText();
    }
    public String get_new_waiter()
    {
    	return jTextField_add_waiter.getText();
    }
    public void set_null()
    {
    	jTextField_add_cook.setText(null);
    	jTextField_add_waiter.setText(null);
    }
    public void add_new_cook_panel(String cook_name)
    {
        Cook_Results cook_resultsPanel = new Cook_Results();
        cook_resultsPanel.layoutCookResults(cook_name);
        cook_resultsPanel.setName(cook_name);
        jPanel5.add(cook_resultsPanel, BorderLayout.EAST);
        cook_resultsPanel.setVisible(true);
        getContentPane().repaint();
        getContentPane().revalidate();
    }
    public void add_new_waiter_panel(String waiter_name)
    {
    	Waiter_Results resultsPanel = new Waiter_Results();
        resultsPanel.layoutWaiterResults(waiter_name);
        resultsPanel.setName(waiter_name);
        jPanel4.add(resultsPanel, BorderLayout.EAST);
        resultsPanel.setVisible(true);
        getContentPane().repaint();
        getContentPane().revalidate();
    }
    public String delete_cook()
    {
    	String cook=null;
    	try
    	{
    		int remove_index = jComboBox_delete_cook.getSelectedIndex();
            cook=jComboBox_delete_cook.getItemAt(remove_index);
            jPanel5.remove(remove_index + 1); //removing subpanel
            jPanel5.repaint();
            jPanel5.revalidate();
            jComboBox_delete_cook.removeItemAt(remove_index);
    	}
    	catch(Exception e) {}
    	return cook;
    	
    }
    
    public String delete_waiter()
    {
    	String waiter=null;
    	try
    	{
            int remove_index = jComboBox_delete_waiter.getSelectedIndex();
            waiter=jComboBox_delete_waiter.getItemAt(remove_index);
            
            jPanel4.remove(remove_index + 1); //removing subpanel
            jPanel4.repaint();
            jPanel4.revalidate();
            jComboBox_delete_waiter.removeItemAt(remove_index);
            }catch(Exception e) {System.out.println("No more waiter");}
    	return waiter;
    			
    }

    
    public int get_prep_time()
    {
        return Integer.parseInt(jComboBox_prep_time.getSelectedItem().toString());	
    }
    
    public int get_order_time()
    {
    	return Integer.parseInt(jComboBox_new_order_time.getSelectedItem().toString());
    }
 
    
    public void DateTime() {
        //Function that updates date and time

                    Calendar calendar = new GregorianCalendar();
                    int mm = calendar.get(Calendar.MONTH);
                    int yy = calendar.get(Calendar.YEAR);
                    int dd = calendar.get(Calendar.DAY_OF_MONTH);
                  
                    jLabel_datetime.setText("Date : " + dd + " - " + (mm + 1) + " - " + yy);         
                }
         
    public void updateModel(TreeMap<String,String> queue)
    {
    	synchronized(model_order)
    	{
    	model_order.setNumRows(0);
    	if(!queue.isEmpty())
    	{
    	for(Map.Entry<String, String> r: queue.entrySet()) {
    		model_order.insertRow(model_order.getRowCount(),new Object[]{
    				r.getKey(),
    				r.getValue()
            		});
    	model_order.notifyAll();	
    	}}}
    }
    public void add_cook_Listener(ActionListener listenForButton)
    {
    	jButton_add_cook.addActionListener(listenForButton);
    }public void add_waiter_Listener(ActionListener listenForButton)
    {
    	jButton_add_waiter.addActionListener(listenForButton);
    }public void delete_cook_Listener(ActionListener listenForButton)
    {
    	jButton_delete_cook.addActionListener(listenForButton);
    }public void delete_waiter_Listener(ActionListener listenForButton)
    {
    	jButton_delete_waiter.addActionListener(listenForButton);
    }public void order_time_Listener(ActionListener listenForButton)
    {
    	jButton_new_order.addActionListener(listenForButton);
    }public void prep_time_Listener(ActionListener listenForButton)
    {
    	jButton_prep_time.addActionListener(listenForButton);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add_cook;
    private javax.swing.JButton jButton_add_waiter;
    private javax.swing.JButton jButton_delete_cook;
    private javax.swing.JButton jButton_delete_waiter;
    private javax.swing.JButton jButton_new_order;
    private javax.swing.JButton jButton_prep_time;
    private javax.swing.JComboBox<String> jComboBox_delete_cook;
    private javax.swing.JComboBox<String> jComboBox_delete_waiter;
    private javax.swing.JComboBox<String> jComboBox_new_order_time;
    private javax.swing.JComboBox<String> jComboBox_prep_time;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_datetime;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_order_status;
    private javax.swing.JTextField jTextField_add_cook;
    private javax.swing.JTextField jTextField_add_waiter;
    // End of variables declaration//GEN-END:variables
}