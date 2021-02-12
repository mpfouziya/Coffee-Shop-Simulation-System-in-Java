package model;

import java.util.*;
import observer_pattern.Observer;
import observer_pattern.Subject;


public class Serve implements Subject {

	public static LinkedList<Order> currentQueueOrder=new LinkedList<Order>();
	public static LinkedList<Order> currentCookOrder=new LinkedList<Order>();
	public static LinkedList<Order> onlineQueueOrder=new LinkedList<Order>();
	
	public static TreeMap<String,String> serveQueue=new TreeMap<String,String>();
	
	public static HashMap<String,Cook> cookList= new HashMap<String,Cook>();
	public static HashMap<String,Waiter> waiterList= new HashMap<String,Waiter>();
	
	public static int prep_time = 3000;
	public static int order_time = 3000;
	
	LogsSingleton logger = LogsSingleton.getInstance();
	
	private ArrayList<Observer> waiterObservers=new ArrayList<>();
	private ArrayList<Observer> cookObservers=new ArrayList<>();
	
	public ArrayList<Observer> getWaiterObservers() {
		return waiterObservers;
	}

	public ArrayList<Observer> getCookObservers() {
		return cookObservers;
	}

		
	//Get first order in the queue
	public LinkedList<Order> getFirstOrder(LinkedList<Order> currentOrder) {
		LinkedList<Order> currOrder= new LinkedList<Order>();
		try
		{
			String currCust=currentOrder.getFirst().getCustId();
					
			for(Order o:currentOrder)
			{
				if(o.getCustId().equals(currCust))
				{
					
				currOrder.add(o);
				}
				else
				{
					break;
				}
			}
		}
		catch(Exception e) {}
		return currOrder;
		
	}
	
	//Get the millisecond cooking time of an item based on the name
	public int getMilliSecByItemId(String itemId) {
		int milliSec=0;
		try
		{
		for(Map.Entry<String, Item> entry: ProcessClass.itemlist.entrySet()){
			if(itemId.equals(entry.getValue().getId())) {
				milliSec = entry.getValue().getCookTimeMS();
			}
		}}
		catch(Exception e) {}
		return milliSec;
	}
	
	//Get total milliseconds of an order
	public int getTotalMilliSec(LinkedList<Order> orderlist) {
		int totalMilliSec=0;
		for(Order o: orderlist){
			totalMilliSec+=getMilliSecByItemId(o.getItemId())*o.getQuantity();
		}
		return totalMilliSec;
	}
	
	//Get Food Name by Item Id
	public String getNameByItemId(String itemId) {
		String name=null;
		for(Map.Entry<String, Item> entry: ProcessClass.itemlist.entrySet()){
			if(itemId.equals(entry.getValue().getId())) {
				name = entry.getValue().getItemName();
			}
		}
		return name;
	}
	
	public void removeCook(String cookName)
	{
		  try
		  {
    		cookList.get(cookName).setExit(true);
    		cookList.remove(cookName);
		  }catch(Exception e) {
		  }
	}
	
	public void removeWaiter(String waiterName)
	{
		try
        {
    		waiterList.get(waiterName).setExit(true);
    		waiterList.remove(waiterName);
        }catch(Exception e) {}
	}
	public void addCook(String cookName)
	{
		  try
		  {
			cookList.put(cookName, new Cook(cookName,this));
		  }catch(Exception e) {
		  }
	}
	
	public void addWaiter(String waiterName)
	{
		try
        {
			waiterList.put(waiterName, new Waiter(waiterName,this));
    
        }catch(Exception e) {}
	}

	

	public void Attach(Observer o)
	{
		getCookObservers().add(o);
	}
	
	public void Detach(Observer o)
	{
		getCookObservers().remove(o);
	}
	
	public void Notify()
	{
		for(Observer o: getCookObservers())
		{
			o.update(this);
		}
	}
	
	
}
