package BatchExecution;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class BE_preparedStatements_insert {
	public static void main(String args[])     {			
		Connection con = null;
		PreparedStatement ps = null;
		try {
		Class.forName("org.postgresql.Driver");
		
		   String url = "jdbc:postgresql://localhost:5432/postgres";
		   String user = "postgres";
		   String password="Ramadevi@21";
		   con = DriverManager.getConnection(url, user, password);
		   String qry =" insert into public.users (user_id,username,password,email,full_name,role) values (?,?,?,?,?,?);";	   
		   ps = con.prepareStatement(qry);
		   ps.setInt(1, 3);
		   ps.setString(2, "Hema");
		   ps.setString(3, "Hema@123");
		   ps.setString(4, "abc1@gmail.com");
		   ps.setString(5, "Hema");
		   ps.setString(6,"SE");
		   ps.addBatch();
		   ps.setInt(1, 4);
		   ps.setString(2, "Mohtih");
		   ps.setString(3, "Mohtih@123");
		   ps.setString(4, "abc2@gmail.com");
		   ps.setString(5, "Mohtih");
		   ps.setString(6,"SE");
		   ps.addBatch();   
		   int result=0;
		  int[] arr = ps.executeBatch();
					  for(int i=0;i<arr.length;i++) {						  
						  result+=arr[i];
					  }		
					  System.out.println("total rows affected:"+result);
		   
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			
			if(con !=null)
			{
				try {
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(ps != null) {
				
				try {
					ps.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
