package controller;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import model.Cook;
import model.Serve;
import model.Waiter;
import observer_pattern.Observer;
import view.Gui_2;


public class Gui_2_Controller implements Observer {

	private Gui_2 theView;
	private Serve serve;
	
	public Gui_2_Controller(Gui_2 theView,Serve model)
	{
		this.theView=theView;
		this.serve=model;
		
		this.theView.add_cook_Listener(new AddCookListener());
		this.theView.delete_cook_Listener(new DeleteCookListener());
		this.theView.add_waiter_Listener(new AddWaiterListener());
		this.theView.delete_waiter_Listener(new DeleteWaiterListener());
		this.theView.order_time_Listener(new OrderTimeListener());
		this.theView.prep_time_Listener(new PrepTimeListener());
		
		for(Map.Entry<String, Waiter> entry : Serve.waiterList.entrySet())
		{
			String waiter_name = entry.getKey();
			theView.load_each_waiter(waiter_name);
		}
		for(Map.Entry<String, Cook> entry : Serve.cookList.entrySet()){
        	String cook_name = entry.getKey();
        	theView.load_each_cook(cook_name);
      	}
	}
	class AddCookListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(!theView.get_new_cook().isEmpty())
			{
				String cook_name=theView.get_new_cook();
				serve.addCook(cook_name);
				theView.add_cook_tolist(cook_name);
				theView.add_new_cook_panel(cook_name);
			}
			theView.set_null();
			
		}
		
	}
	class DeleteCookListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			String cook=theView.delete_cook();
			serve.removeCook(cook);
			
		}
		
	}
	class AddWaiterListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(!theView.get_new_waiter().isEmpty())
			{
				String waiter_name=theView.get_new_waiter();
				serve.addWaiter(waiter_name);
				theView.add_waiter_tolist(waiter_name);
				theView.add_new_waiter_panel(waiter_name);
			}
			theView.set_null();
		
	    }
	}
	class DeleteWaiterListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			String waiter=theView.delete_waiter();
			serve.removeWaiter(waiter);	
		}
		
	}
	class OrderTimeListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			Serve.prep_time=theView.get_prep_time();
			
		}
		
	}
	class PrepTimeListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			Serve.order_time=theView.get_order_time();
			
		}
		
	}
	public void updateQueue()
	{
		theView.updateModel(Serve.serveQueue);

	}

	public void update(Object o)
	{
		if(o instanceof Serve)
		{
		updateQueue();
		}
	}
}
