package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

import model.*;
import view.*;

public class Gui_New_Order_Controller {
	
	private Gui_New_Order theView;
	private ProcessClass processClass;
	private Serve serve;
	LinkedList<Order> orderList;
	
	public Gui_New_Order_Controller(Gui_New_Order theView,ProcessClass model,Serve serve)
	{
		this.theView=theView;
		this.processClass=model;
		this.serve=serve;
		this.theView.hotBevListener(new HotBevListener());
		this.theView.coldBevListener(new ColdBevListener());
		this.theView.shakeListener(new ShakesListener());
		this.theView.quickBiteListener(new QuickBiteListener());
		this.theView.addListener(new AddListener());
		this.theView.addQueueListener(new AddQueueListener());
		this.theView.editListener(new EditListener());
		this.theView.newOrderListener(new NewOrderListener());
		this.theView.removeListener(new RemoveListener());
		this.theView.view_staff_Listener(new StaffListener());
		this.theView.checkStatusListener(new CheckListener());
		this.theView.comboListener(new ComboListener());
		this.theView.windowListener(new WindowCloseListener());
		
		model.readItems();
		model.readOrder();
		model.startService(serve);
		
	}
	class WindowCloseListener implements WindowListener
	{



		@Override
		public void windowActivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
			Gui_Report theReportView=new Gui_Report();
			
			new Gui_Report_Controller(theReportView,processClass);
			theReportView.setVisible(true);
			
		}

		@Override
		public void windowClosing(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowOpened(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	class HotBevListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			List<String> list = processClass.getItemsByCategory("HotBeverage");
			theView.setFillItems(list);
			theView.setPrice(Double.toString(processClass.getUnitPriceByItemName(theView.getComboItem())));
			
		}
		
	}
	class ColdBevListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			List<String> list = processClass.getItemsByCategory("ColdBeverage");
			theView.setFillItems(list);
			theView.setPrice(Double.toString(processClass.getUnitPriceByItemName(theView.getComboItem())));
			
		}
		
	}
	class ShakesListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			List<String> list = processClass.getItemsByCategory("Shake");
			theView.setFillItems(list);
			theView.setPrice(Double.toString(processClass.getUnitPriceByItemName(theView.getComboItem())));
			
		}
		
	}
	class QuickBiteListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			List<String> list = processClass.getItemsByCategory("Quick bites");
			theView.setFillItems(list);
			theView.setPrice(Double.toString(processClass.getUnitPriceByItemName(theView.getComboItem())));
			
		}
		
	}
	class CheckListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
	        if(theView.getOnlineStatus()) {
	        	ProcessClass.online = true;
	        }
	        else {
	        	ProcessClass.online = false;
	        }
		}
		
	}
	class RemoveListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			theView.removeItems();
		}
	}
	class ComboListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String var = Double.toString(processClass.getUnitPriceByItemName(theView.getComboItem()));
			theView.setPrice(var);
			theView.defaultQuantity();
		}
	}
	class NewOrderListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			theView.newOrder();
		}
	}
	class EditListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			theView.editPerformed();
		}
	}
	class AddListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			theView.addNewLine();
			calculate_total();
		}
	}
	class AddQueueListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
	        // Add to Queue
	    	calculate_total();
	        processClass.addOrder(orderList);
		}
	}
	class StaffListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
           Gui_2 theStaffView=new Gui_2();
           Gui_2_Controller gui_2=new Gui_2_Controller(theStaffView,serve);
			serve.Attach(gui_2);
			theStaffView.setVisible(true);
		}
	}
	  public LinkedList<Order> getCurrentOrderList()
	    {
	        // Iterate through the table and add return the full order as list
	    	for (int row=0; row < theView.getOrderRowCount(); row++) {
	    		Timestamp time = new Timestamp(System.currentTimeMillis());
	    		String custId = processClass.generateOrderId();
	    		String item = processClass.getItemIdByItemName(theView.getRowValueOf(row, 1));
	    		int quantity = Integer.parseInt(theView.getRowValueOf(row, 3));
	    		double amount = Double.parseDouble(theView.getRowValueOf(row, 2))*quantity;
	    		saveOrderToList(time,custId,item,quantity,amount);
	    	}
	    	return orderList;
	    		   
	    }
	  public void saveOrderToList(Timestamp time, String custId, String item, int quantity, double amount)
	    {
	    	/* save the order to the linked list of current orderList */
	    	try
	    	{
	    	Order order = new Order(time,custId,item,quantity,amount);
	        orderList.add(order);
	    	}
	    	catch(PatternException pe) {
				JOptionPane.showMessageDialog(null, pe.getMessage());
			}
	    }
	    private void calculate_total() {
	    	/**
	         * Display the total amount 
	         */
	     	orderList = new LinkedList<Order>();
	         int total = 0, quantity = 0 ;
	         double unitPrice = 0;
	         double discountAmt=0;
	         Discount discount = new Discount();
	         
	                 
	         for (int i = 0; i < theView.getOrderRowCount(); i++){
	             quantity = Integer.parseInt(theView.getRowValueOf(i, 3));
	             unitPrice = Double.parseDouble(theView.getRowValueOf(i, 2));
	             total += quantity * unitPrice;
	         }
	         
	         orderList=getCurrentOrderList();
	         discountAmt = discount.calculateDiscount((double)total,orderList);
	         theView.setTotal(Double.toString((double)total - discountAmt));
	         theView.setDiscount(Double.toString(discountAmt));
	         
	    }

}
