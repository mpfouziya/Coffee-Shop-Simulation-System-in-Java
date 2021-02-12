package controller;

import java.util.LinkedList;

import model.Order;
import model.ProcessClass;
import model.Serve;
import view.Cook_Subpanel;

public class Cook_Subpanel_Controller  implements Runnable {
	
	private Cook_Subpanel theView;
	String name;
	
	public Cook_Subpanel_Controller(Cook_Subpanel theView,String name)
	{
		this.theView=theView;
		this.name=name;
		theView.setCookName(this.name);
		Thread t=new Thread(this,this.name);
        t.start();
	}
	public void run() {
		  
	  	  {
	  		  while(true)
	  		  {
	  	         String text="No order to process";
	  	         try
	  	         {
	  	         LinkedList<Order> cOrder=Serve.cookList.get(this.name).getCurr();
	  	         if(!cOrder.isEmpty())
	  	         {
	  	         text="Currently Preparing:"+cOrder.getFirst().getCustId();
	  	         text+="\n Preparation time :"+Serve.cookList.get(this.name).getMilliSec();
	  	         for(Order o:cOrder){
	  	          String itemId=o.getItemId();
	  	          String itemName=ProcessClass.itemlist.get(itemId).getItemName();
	  	          text+="\n" + itemName + " " + o.getQuantity();
	  	         }
	  	        text+="\n"+Serve.cookList.get(this.name).getSec();
	  	         }
	  	         }catch(Exception e) {}
	  	            theView.setCookStatus(text);
	  	        }
	  	  }
	    }

}
