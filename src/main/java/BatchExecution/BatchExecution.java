package BatchExecution;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class BatchExecution {
		public static void main(String[] args) {
			
			Connection con = null;
			Statement st = null;
			try {
				
				Class.forName("org.postgresql.Driver");
				
				   String url = "jdbc:postgresql://localhost:5432/postgres";
				   String user = "postgres";
				   String password="Ramadevi@21";
				   
				   con = DriverManager.getConnection(url, user, password);
				   
				   st = con.createStatement();
				   
				   
				   st.addBatch("update public.users set username='HemaDevi' where user_id=3");
				   st.addBatch("insert into public.users (user_id,username,password,email,full_name,role) values "
				   		+ "(7,'karthik','karthik@123','abc8@gamil.com','karthik','SE') ");
				   st.addBatch("delete from public.users  where user_id in (1,3,5) ");
				
				  int[] arr = st.executeBatch();
				  
				  for(int i=0;i<arr.length;i++) {
					  
					  System.out.println(arr[i]+" : rows affected");  
				  }
				  
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
				
				if(st != null) {
					
					try {
						st.close();
					}catch(SQLException e) {
						e.printStackTrace();
					}
				}
			}
			
		}
	}
