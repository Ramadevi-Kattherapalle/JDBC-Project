package PreparedStatements;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class PSIdeletion {
	public static void main(String args[])     {			
		Connection con = null;
		PreparedStatement ps1 = null;
		
		try {
		Class.forName("org.postgresql.Driver");
		
		   String url = "jdbc:postgresql://localhost:5432/postgres";
		   String user = "postgres";
		   String password="Ramadevi@21";
		   con = DriverManager.getConnection(url, user, password);
		
		   int rowsaffected1=0;
		   //delete
		   String qry1 =" delete from public.users where user_id=?;";
		   ps1 = con.prepareStatement(qry1);
		   ps1.setInt(1,3);
		   rowsaffected1 += ps1.executeUpdate();
		   ps1.setInt(1,4);
		   rowsaffected1 += ps1.executeUpdate();
		   ps1.setInt(1,5);
		   rowsaffected1 += ps1.executeUpdate();
		 
		   System.out.println(" Affected Rows in the Table : "+ rowsaffected1);
		   
		}
		   catch(ClassNotFoundException | SQLException e) {
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
				
				if(ps1 != null) {
					
					try {
						ps1.close();
					}catch(SQLException e) {
						e.printStackTrace();
					}
				}
				
			}
		   

}}
