package controller;

import java.util.LinkedList;

import model.Order;
import model.ProcessClass;
import model.Serve;
import view.Waiter_Subpanel;

public class Waiter_Subpanel_Controller implements Runnable {
	
	private Waiter_Subpanel theView;
	String name;
	
	public Waiter_Subpanel_Controller(Waiter_Subpanel theView,String name)
	{
		this.theView=theView;
		this.name=name;
		theView.setWaiterName(this.name);
		Thread t=new Thread(this,this.name);
        t.start();
	}
    public void run() {
        //Function that updates date and time
    	 while(true)
    	  {
    	         String text="";
    	         try
    	         {
    	         LinkedList<Order> cOrder=Serve.waiterList.get(this.name).getCurr();
    	         if(!cOrder.isEmpty())
    	         {
    	         text="Currently Servicing:"+cOrder.getFirst().getCustId();
    	         for(Order o:cOrder){
    	          String itemId=o.getItemId();
    	          String itemName=ProcessClass.itemlist.get(itemId).getItemName();
    	          text+="\n" + itemName + " " + o.getQuantity();
    	         }
    	         }}catch(Exception e) {}
    	         
    	            theView.setWaiterStatus(text);     
    	        }
    }

}
