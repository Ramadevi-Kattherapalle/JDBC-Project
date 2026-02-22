package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatePlatform {
	public static void main(String[]args) {
		// load and register
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver is loaded and register successfully");
			//connection establish
			Connection con=null;
			Statement st=null;
			String url="jdbc:postgresql://localhost:5432/postgres";
			String user="postgres";
			String password="Ramadevi@21";
			 con=DriverManager.getConnection(url,user,password);
			System.out.println("connection is establised");
			if(con==null)
				System.out.println("connection not active");
			else
				System.out.println("connecton is active");
	     
		//step:-3 create a paltform
		st=con.createStatement();
		System.out.println("create statement or platform successfully");
		}
		catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
	}
}
