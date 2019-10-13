package de.hdm.shared.bo;

import com.google.gwt.user.client.rpc.IsSerializable;

public class User implements IsSerializable  {
	
	private static final long serialVersionUID = 1L;

	
	private int userID;
	
	private String vorname;
	
	private String nachname;

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	
	public String toString() {
		
		return "UserID" + this.getUserID() + " " + this.getVorname() +" " + this.getNachname();
	}
	
	

}
