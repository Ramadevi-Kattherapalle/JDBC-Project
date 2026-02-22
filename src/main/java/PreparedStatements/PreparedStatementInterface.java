package PreparedStatements;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class PreparedStatementInterface {		
		public static void main(String args[])     {			
			Connection con = null;
			PreparedStatement ps = null;
			try {
			Class.forName("org.postgresql.Driver");
			
			   String url = "jdbc:postgresql://localhost:5432/postgres";
			   String user = "postgres";
			   String password="Ramadevi@21";
			   con = DriverManager.getConnection(url, user, password);
			   
			   int rowsaffected =0;
			   String qry =" insert into public.users (user_id,username,password,email,full_name,role) values (?,?,?,?,?,?);";
					   
			   ps = con.prepareStatement(qry);
			   
			   ps.setInt(1, 3);
			   ps.setString(2, "Hema");
			   ps.setString(3, "Hema@123");
			   ps.setString(4, "abc1@gmail.com");
			   ps.setString(5, "Hema");
			   ps.setString(6,"SE");
			   
			   rowsaffected += ps.executeUpdate();
			   
			   ps.setInt(1, 4);
			   ps.setString(2, "Mohtih");
			   ps.setString(3, "Mohtih@123");
			   ps.setString(4, "abc2@gmail.com");
			   ps.setString(5, "Mohtih");
			   ps.setString(6,"SE");
			   
			   rowsaffected += ps.executeUpdate();
			   
			   
			   ps.setInt(1, 5);
			   ps.setString(2, "Yashwanth");
			   ps.setString(3, "Yashwanth@123");
			   ps.setString(4, "abc3@gmail.com");
			   ps.setString(5, "Yashwanth");
			   ps.setString(6,"SE");
			   
			   rowsaffected += ps.executeUpdate();
			   
			   ps.setInt(1, 6);
			   ps.setString(2, "Tharun");
			   ps.setString(3, "Tharun@123");
			   ps.setString(4, "abc4@gmail.com");
			   ps.setString(5, "Tharun");
			   ps.setString(6,"SE");
			   
			   rowsaffected += ps.executeUpdate();
			   
			   
			   
			   System.out.println(" Affected Rows in the Table : "+ rowsaffected);
			
			
			
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

