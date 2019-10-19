package de.hdm.shared.bo;

import java.io.Serializable;

import com.google.gwt.user.client.rpc.IsSerializable;

public class Produkt implements Serializable {
	
	private static final long serialVersionUID = 1L;

	
	 int produktID;
	
	 String name;
	 
	 String date;

	
	public Produkt() {
		
	}
	
	public Produkt(int produktID, String name, String date) {
		this.produktID=produktID;
		this.name=name;
		this.date=date;

	}

	public int getProdutkID() {
		return produktID;
	}

	public void setProdutkID(int produtkID) {
		this.produktID = produtkID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getDate() {
		return date;
	}

	public String toString() {
	
	return "produktID" + this.getProdutkID() + " " 	+ this.getName();
	
}
}
