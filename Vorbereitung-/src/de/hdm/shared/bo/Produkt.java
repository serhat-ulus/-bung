package de.hdm.shared.bo;

import com.google.gwt.user.client.rpc.IsSerializable;

public class Produkt implements IsSerializable {
	
	private static final long serialVersionUID = 1L;

	
	private int produktID;
	
	private String name;
	
	public Produkt() {
		
	}
	
	public Produkt(int produktID, String name) {
		this.produktID=produktID;
		this.name=name;
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

	public String toString() {
	
	return "produktID" + this.getProdutkID() + " " 	+ this.getName();
	
}
}
