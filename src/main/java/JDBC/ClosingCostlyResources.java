package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ClosingCostlyResources {
			public static void main(String args[]) {
				Connection con = null;
				Statement st = null;
				ResultSet result=null;
				try {
//						Step 1: load and register the driver
					Class.forName("org.postgresql.Driver");
					System.out.println("Driver is loaded and register successfully");

//				    Step 2 : Establish the Connection between the java and database

					

					String url = "jdbc:postgresql://localhost:5432/postgres";
					String user = "postgres";
					String password = "Hema@2001";

					con = DriverManager.getConnection(url, user, password);
					System.out.println("Established connection between the java and database");

					if (con == null)
						System.out.println("Connection Not-Active");
					else
						System.out.println("Connection Active");

					// step 3 : create the statement or platform.
					st = con.createStatement();
					System.out.println("created statement or platform successfully");
					// step 4 : Execute the Query 
					String qry ="SELECT id,departments FROM public.SKU\r\n" + //
					"ORDER BY id ASC"; 
					 result = st.executeQuery(qry); 
					System.out.println("Execute the query"); 
					
					// step 5 : process the result
					   
					   while(result.next()) {
						   
						   System.out.println("User Id : "+ result.getInt("id"));
						   System.out.println("User departments : "+ result.getString("departments"));
					   }
					   //insertion
				   String qry1="insert into SKU(departments)values('socialism')";
						int count1=st.executeUpdate(qry1);
					System.out.println("insertion is done in "+count1+" row");
					   //update
					   String qry2 ="update SKU set id=15 where departments='sericulture'";
						 int count2 = st.executeUpdate(qry2);
						 System.out.println("updation is done in "+count2+"rows");
						 //delete opertation
						 String qry3 ="delete from SKU where id=2";
							int count3 = st.executeUpdate(qry3);
							System.out.println("deletion is done in "+count3+"rows");
							//execute
							String qry4="update SKU set departments='cst' where id=10";
							boolean count4=st.execute(qry4);
							if(!count4) {
								int count=st.getUpdateCount();
								System.out.println("updation is completely  done");	
								System.out.println(count);
							}
							else {
								System.out.println("no update count returned");
								}

				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
			finally {
	
        try {
        	
        	if(st!=null)
        		st.close();
        	if(con!=null) {
        		con.close();
        		if(result!=null)
            		result.close();
        	}
        
        System.out.println("All costly properties closed successfully!");
    } catch (SQLException e) {
        e.printStackTrace();
         }
	  }
    }
}
