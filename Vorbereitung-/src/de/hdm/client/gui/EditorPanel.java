package de.hdm.client.gui;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.VerticalPanel;



public class EditorPanel extends HorizontalPanel {
	
	
	
	HorizontalPanel test = new HorizontalPanel();
		
	Button schmeckt = new Button("add");
	
	ProduktForm produkt= null;
	
//	private OpenUpClickHandler openUp;
	
	public EditorPanel() {
		
	}
    
    
	
	public EditorPanel(ProduktForm produkt) {
		
		this.produkt=produkt;
		

		
	//	openUp = new OpenUpClickHandler();
		
	
		
		
      }
   
		
		
		
	
	
	
public void onLoad() {
	
	 
   //  this.add(b);
//	super.onLoad();
	
	this.add(schmeckt);

	
	test.add(schmeckt);
	
	schmeckt.addClickHandler(new OpenUpClickHandler(this.produkt) );
	
//	schmeckt.addClickHandler(openUp);
	
	
	schmeckt.addStyleName("ss");   
   
	this.add(test);

	

	}


		

    class OpenUpClickHandler implements ClickHandler {
    	
    	private ProduktForm produkt = null;
    	
    	private OpenUpClickHandler(ProduktForm p) {
    		this.produkt=produkt;
    	}
    	
		public void onClick(ClickEvent event) {
			
			ProduktForm produkt = new ProduktForm();
			produkt.openCommentEditForm();
			

    }
		
		
		
		
    }
}



