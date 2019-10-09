package de.hdm.client.gui;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;


public class ProduktForm extends DialogBox {

	Button closeButton = new Button("X");
	Label changeLabel = new Label("Produkt bearbeiten:");
	Button saveButton = new Button("Änderungen speichern");
	final Label info = new Label("Bitte Textfeld befüllen!");
	VerticalPanel content = new VerticalPanel();
	private SaveCommentChangesClickHandler saveCommentsClick;



	
	public ProduktForm() {
		
	}
	
	public void onLoad() {
		super.onLoad();
		content.add(closeButton);
		content.add(changeLabel);
		content.add(saveButton);
		this.add(content);
		

		
	}

	class SaveCommentChangesClickHandler implements ClickHandler {

		@Override
		public void onClick(ClickEvent event) {
			// TODO Auto-generated method stub
			
		}
		
	}

	
	



	
	
}
