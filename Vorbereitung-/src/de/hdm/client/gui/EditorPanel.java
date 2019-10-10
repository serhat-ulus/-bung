package de.hdm.client.gui;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class EditorPanel extends ProduktForm {
	
	
	private OpenUpClickHandler openUp;
	VerticalPanel test = new VerticalPanel();

	 
	
	
	
			 // scrollpanel with text  
			 ScrollPanel scrollPanel = new ScrollPanel(); 
	
			 
	
	
	
	Button add = new Button("Add");
	
	
	
	
	Label l1 = new Label("etb");
	

  //  ScrollPanel scrollPanel = new ScrollPanel();
	
	
	
    
    
    DecoratorPanel decoratorPanel = new DecoratorPanel();
    
    
    

    



	
	
	public EditorPanel() {
		
		openUp = new OpenUpClickHandler();

		
		
	}
	
	
public void onLoad() {
	
	test.add(add);
	
	add.addClickHandler(openUp);
	
	this.add(test);
	
	

	}
		

    class OpenUpClickHandler implements ClickHandler {
    	
		public void onClick(ClickEvent event) {
			openCommentEditForm();

    }
		
		
		
		
    }
}



