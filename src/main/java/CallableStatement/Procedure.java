package CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;

public class Procedure {
	public static void main(String[]args) {
		Connection con = null;
		CallableStatement cs=null;
	try {
//		Step 1: load and register the driver
	Class.forName("org.postgresql.Driver");
	System.out.println("Driver is loaded and register successfully");

//    Step 2 : Establish the Connection between the java and database

	
	 

	String url = "jdbc:postgresql://localhost:5432/postgres";
	String user = "postgres";
	String password = "Ramadevi@21";

	con = DriverManager.getConnection(url, user, password);
	System.out.println("Established connection between the java and database");

	if (con == null)
		System.out.println("Connection Not-Active");
	else
		System.out.println("Connection Active");
	 cs=con.prepareCall("{ CALL in_car(?,?,?,?)}");
		cs.setInt(1,1);
		cs.setString(2, "toyota");
		cs.setString(3, "Corolla");
        cs.setDate(4, Date.valueOf("2022-04-21"));
        cs.execute();
        System.out.println("procedure is successfully completed");
	
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		
		if(con !=null)
		{
			try {
				con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		if(cs !=null)
		{
			try {
				con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}}

	}
	}}