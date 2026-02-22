package BatchExecution;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class BE_PS_update_delete {
	public static void main(String args[])     {			
		Connection con = null;
		PreparedStatement ps = null;
		try {
		Class.forName("org.postgresql.Driver");
		
		   String url = "jdbc:postgresql://localhost:5432/postgres";
		   String user = "postgres";
		   String password="Ramadevi@21";
		   con = DriverManager.getConnection(url, user, password);
		   String qry =" delete from public.users where user_id=?;";	   
		   ps = con.prepareStatement(qry);
		   ps.setInt(1, 3);
		   ps.addBatch();
		   ps.setInt(1, 4);
		   ps.addBatch();
		   ps.setInt(1, 5);
		   ps.addBatch();
		   String qry1 =" update public.users set password=? where user_id=?;";	   
		   ps = con.prepareStatement(qry1);
		   ps.setString(1,"123456");
		   ps.setInt(2,3);
		   ps.addBatch();
		   ps.setString(1,"abcdef");
		   ps.setInt(2,4);
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