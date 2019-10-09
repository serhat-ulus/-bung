package de.hdm.client.gui;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class EditorPanel extends VerticalPanel{
	
	 
	
	
	
			 // scrollpanel with text  
			 ScrollPanel scrollPanel = new ScrollPanel(); 
			 //scrollPanel.setSize("300px", "100px");  
			  // Adding the scroll panel to the root panel.  
	
	
	
	
	Button add = new Button("Add");
	
	Label l1 = new Label("etb");
	
	
  

	
	
	public EditorPanel() {
		this.add(add);
		this.add(scrollPanel);
		this.add(l1);
	}
	
public void onLoad() {
		
		
		
	}


}
