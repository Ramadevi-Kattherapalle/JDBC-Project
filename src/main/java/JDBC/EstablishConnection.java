package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class EstablishConnection {
	public static void main(String[]args) {
		// load and register
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver is loaded and register successfully");
			//connection establish
			String url="jdbc:postgresql://localhost:5432/postgres";
			String user="postgres";
			String password="Ramadevi@21";
			Connection con=DriverManager.getConnection(url,user,password);
			System.out.println("connection is establised");
		}
		catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
	}
}
