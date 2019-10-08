package de.hdm.client.gui;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class EditorPanel extends VerticalPanel{
	
	

	
	
	
	
	Button add = new Button("Add");
	
	Label l1 = new Label("etb");
	
    ScrollPanel scrollPanel = new ScrollPanel();
    
    
    DecoratorPanel decoratorPanel = new DecoratorPanel();
    
    
    

    

    
    
    

    
  

	
	
	public EditorPanel() {
		this.add(add);
		this.add(scrollPanel);
		this.add(l1);
	}
	
public void onLoad() {
		
		
		
	}
/*	
	// Create scrollable text 
    HTML contents = new HTML("This is a ScrollPanel."
       +" By putting some fairly large contents in the middle"
       +" and setting its size explicitly, it becomes a scrollable area"
       +" within the page, but without requiring the use of an IFRAME."
       +" Here's quite a bit more meaningless text that will serve primarily"
       +" to make this thing scroll off the bottom of its visible area."
       +" Otherwise, you might have to make it really, really"
       +" small in order to see the nifty scroll bars!");

    //create scrollpanel with content
    ScrollPanel scrollPanel = new ScrollPanel(contents);
    scrollPanel.setSize("400px", "100px");

    DecoratorPanel decoratorPanel = new DecoratorPanel();

    decoratorPanel.add(scrollPanel); */


}
