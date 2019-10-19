package de.hdm.client.gui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import de.hdm.client.GreetingService;
import de.hdm.client.GreetingServiceAsync;





public class ProduktForm extends DialogBox {

	Button closeButton = new Button("X");
	Label changeLabel = new Label("Produkt hinzufügen:");
	Button saveButton = new Button("Änderungen speichern");
	Button editButton = new Button("Editieren");
	final Label info = new Label("Bitte Textfeld befüllen!");
	VerticalPanel content = new VerticalPanel();
	HorizontalPanel hz = new HorizontalPanel();
	Button but = new Button("f");
	TextBox box = new TextBox();
//	private SaveCommentChangesClickHandler saveCommentsClick;
	private CloseCommentEditFormClickHandler closeCommentClick;
	private openCommentEditFormClickHandler openComment;
	private sichernhandler a1;
	
	private static GreetingServiceAsync greetingService = GWT.create(GreetingService.class);





	
	public ProduktForm() {
		
	//	this.add(box);
		
	//	this.add(saveButton);
		
	//	sichernhandler a1 = new sichernhandler();
		
	//	this.saveButton.addClickHandler(a1);
		this.add(saveButton);
		closeCommentClick = new CloseCommentEditFormClickHandler();
		openComment = new openCommentEditFormClickHandler();
		a1 = new sichernhandler();
		this.saveButton.addClickHandler(a1);
		

		
	}
	
	public void onLoad() {
	//	super.onLoad();
		content.add(closeButton);
		content.add(changeLabel);
		content.add(box);
		content.add(saveButton);
		content.add(editButton);
		
		but.addClickHandler(openComment);
     	closeButton.addClickHandler(closeCommentClick);
     	editButton.addClickHandler(openComment);
     	saveButton.addClickHandler(new sichernhandler());
     	editButton.addClickHandler(new editierenhandler());
     	
     	
     	closeButton.addStyleName("closer");
		changeLabel.addStyleName("cc");

    // 	this.hide();
		this.add(content);

		

		
	}

	/*class SaveCommentChangesClickHandler implements ClickHandler {

		@Override
		public void onClick(ClickEvent event) {
			// TODO Auto-generated method stub
			
		}
	
	}  */
	
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
	
	class openCommentEditFormClickHandler implements ClickHandler{
		
		public void onClick(ClickEvent event) {
			openCommentEditForm();

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
	//	if (this.info.isAttached() == true) {
	//		this.content.remove(this.info);
	//	}
	}

	private class sichernhandler implements ClickHandler{
		

		@Override
		public void onClick(ClickEvent event) {
			greetingService.greetServer(box.getText(), new AsyncCallback<String>() {

				
				
                public void onFailure(Throwable caught) {
					
	            box.setText(caught.getMessage());
	    //        System.out.println("Fail");
					
				}

				@Override
				public void onSuccess(String result) {
					// TODO Auto-generated method stub
		 //           System.out.println("Success");

					
					
				}			
});
			
			
		}
		
		
	}
	
	private class editierenhandler implements ClickHandler {

		@Override
		public void onClick(ClickEvent event) {
				Window.alert("du hast etwas editiert");
		}
		

	}

	
	
}
