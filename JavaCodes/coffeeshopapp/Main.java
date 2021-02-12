package coffeeshopapp;

import controller.Gui_New_Order_Controller;
import model.ProcessClass;
import model.Serve;
import view.Gui_New_Order;

public class Main {
	
	public static ProcessClass processClass;

	public static void main(String args[])
	{
		processClass=new ProcessClass();
		Serve serve=new Serve();
		Gui_New_Order theView=new Gui_New_Order();
		
		new Gui_New_Order_Controller(theView,processClass,serve);
		theView.setVisible(true);

		
	}
}
