package de.hdm.server;

import de.hdm.client.GreetingService;
import de.hdm.server.db.ProduktMapper;
import de.hdm.shared.bo.Produkt;

import java.sql.SQLException;
import java.util.ArrayList;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements GreetingService {

	@Override
	public String greetServer(String name) throws IllegalArgumentException {
		
		
		try {
			ProduktMapper.produktmapper().insert(name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList<Produkt> getAllData(){
		return ProduktMapper.produktmapper().getAllData();		
	}

	

}
		