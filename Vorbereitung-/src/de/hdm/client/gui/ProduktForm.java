package de.hdm.client.gui;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;





public class ProduktForm extends DialogBox {

	Button clickMe = new Button ("Click Me!");
	Button closeButton = new Button("X");
	Label changeLabel = new Label("Produkt hinzufügen:");
	Button saveButton = new Button("Änderungen speichern");
	Button editButton = new Button("Editieren");
	final Label info = new Label("Bitte Textfeld befüllen!");
	VerticalPanel content = new VerticalPanel();
	HorizontalPanel p1 = new HorizontalPanel();
	TextBox box = new TextBox();
	private SaveCommentChangesClickHandler saveCommentsClick;
	private CloseCommentEditFormClickHandler closeCommentClick;




	
	public ProduktForm() {
		
		closeCommentClick = new CloseCommentEditFormClickHandler();

		
	}
	
	public void onLoad() {
		super.onLoad();
		content.add(closeButton);
		content.add(changeLabel);
		content.add(box);
		content.add(saveButton);
		content.add(editButton);
		p1.add(clickMe);
     	closeButton.addClickHandler(closeCommentClick);
     	saveButton.addClickHandler(new sichernhandler());
     	editButton.addClickHandler(new editierenhandler());
		this.add(content);
		this.add(p1);
		

		
	}

	class SaveCommentChangesClickHandler implements ClickHandler {

		@Override
		public void onClick(ClickEvent event) {
			// TODO Auto-generated method stub
			
		}
	
	}
	
	class CommentKeyPressHandler implements KeyPressHandler {

		@Override
		public void onKeyPress(KeyPressEvent event) {
			// TODO Auto-generated method stub
			if (event.getNativeEvent().getKeyCode() == KeyCodes.KEY_ESCAPE) {
				closeCommentEditForm();
			}
			
		}

	}
	
	class CloseCommentEditFormClickHandler implements ClickHandler {

		@Override
		public void onClick(ClickEvent event) {
			closeCommentEditForm();
			
		}
		
		
	}
	
	/*
	 * Methoden zum Öffnen und Schließen der CommentEditForm.
	 */
	
	public void closeCommentEditForm() {
		this.hide();
		this.clear();
		this.removeFromParent();
		this.setAnimationEnabled(false);
		this.setGlassEnabled(false);

		
	}
	
	public void openCommentEditForm() {
		this.setGlassEnabled(true);
		this.setAnimationEnabled(true);
		this.center();
		this.show();
		box.setFocus(true);
		if (this.info.isAttached() == true) {
			this.content.remove(this.info);
		}
	}

	private class sichernhandler implements ClickHandler{

		@Override
		public void onClick(ClickEvent event) {
				Window.alert("die Eingabe wurde gesichert");
		}
		
	}
	
	private class editierenhandler implements ClickHandler {

		@Override
		public void onClick(ClickEvent event) {
				Window.alert("du hast etwas editiert");
		}
		

	}

	
	
}
