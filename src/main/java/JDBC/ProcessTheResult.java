package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProcessTheResult {
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
		//step:-4 Execute query
		String qry = "SELECT * FROM SKU ORDER BY id ASC";		ResultSet result=st.executeQuery(qry);
		System.out.println("execute query");
		//step:-5 process the result
		  while(result.next()) {
			   
			   System.out.println("Id : "+ result.getInt("id"));
			   System.out.println("departments : "+ result.getString("departments"));
			   System.out.println("facultyno: "+result.getInt("facultyno"));
			   System.out.println("strength: "+result.getInt("strength"));
			   System.out.println("lab: "+result.getBoolean("lab"));
			   
		   }
		   //insertion
	   String qry1="insert into SKU(departments)values('law')";
			int count1=st.executeUpdate(qry1);
		System.out.println("insertion is done in "+count1+" row");
		   //update
		   String qry2 ="update SKU set id=10 where departments='sericulture'";
			 int count2 = st.executeUpdate(qry2);
			 System.out.println("updation is done in "+count2+"rows");
			 //delete opertation
			 String qry3 ="delete from SKU where id=15";
				int count3 = st.executeUpdate(qry3);
				System.out.println("deletion is done in "+count3+"rows");
				//execute
				String qry4="update SKU set departments='ecommerce' where id=1";
				boolean count4=st.execute(qry4);
				if(!count4) {
					int count=st.getUpdateCount();
					System.out.println("updation is completely  done");	
					System.out.println(count);
				}
				else {
					System.out.println("no update count returned");
					}
		}
		
		catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
	}
}
