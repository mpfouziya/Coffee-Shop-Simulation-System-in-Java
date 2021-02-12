package controller;


import model.ProcessClass;
import view.Gui_Report;

public class Gui_Report_Controller {
	
	private Gui_Report theView;
	private ProcessClass processClass;
	
	public Gui_Report_Controller(Gui_Report theView,ProcessClass model)
	{
	this.theView=theView;
	this.processClass=model;
	processClass.populateReportList();
	String report = processClass.generateReport();
	theView.setReport(report);
	theView.setVisible(true);
	}

}
