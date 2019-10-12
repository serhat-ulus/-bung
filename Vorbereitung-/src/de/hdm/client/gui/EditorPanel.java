package de.hdm.client.gui;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DecoratorPanel;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class EditorPanel extends ProduktForm {

	private OpenUpClickHandler openUp;
	VerticalPanel test = new VerticalPanel();

	Button add = new Button("Add");

	public EditorPanel() {

		this.openUp = new OpenUpClickHandler();

	}

	public void onLoad() {

		test.add(add);

		add.addClickHandler(new OpenUpClickHandler());

		this.add(test);

		add.addStyleName("ss");

	}

	class OpenUpClickHandler implements ClickHandler {

		public void onClick(ClickEvent event) {
			ProduktForm pf = new ProduktForm();
			pf.show();
			
			
			//openCommentEditForm();

		}

	}
}
