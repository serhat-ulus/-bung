package de.hdm.server.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import de.hdm.shared.bo.Produkt;

public class ProduktMapper {
	
	protected ProduktMapper() {		
	}
	
	private static ProduktMapper produktmapper;

	
	  public static ProduktMapper produktmapper() {
		    if (produktmapper == null) {
		    	produktmapper = new ProduktMapper();
		    }

		    return produktmapper();
		  }
	  
	  public void insert(String l) throws SQLException {  // Inhalte einfügen in die Datenbank
			
			Connection con = DBConnection.getConnection();
			
			Statement stm = con.createStatement();
			
			stm.executeUpdate("INSERT INTO Produkt (name) VALUES ('" + l + "')");	
		
		}
		
		public void delete (String s) throws SQLException{  // Inhalte aus der Dazenbank löschen
			
			Connection con = DBConnection.getConnection();
			
			Statement stm = con.createStatement();
			
			stm.executeUpdate("DELETE FROM Produkt;" );
		}
		
		
		public ArrayList<Produkt> getAllData(){  // Inhalte ausgeben aus der Datenbank
			ArrayList<Produkt> liste = new ArrayList<Produkt>();
			
			Connection con = DBConnection.getConnection();
			
			Statement stm;
			try {
				stm = con.createStatement();
				
				ResultSet rs = stm.executeQuery("SELECT * FROM Produkt;");
				
				
				
				while(rs.next()) {
					liste.add(new Produkt(rs.getInt("produktID"), rs.getString("name")));
				}
				
				return liste;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
			
			
		}
	


//
}
