package PreparedStatements;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PSIupdate {
	public static void main(String args[])     {
	// update
	  
	   PreparedStatement ps2 = null;
	   Connection con = null;
	   try {
			Class.forName("org.postgresql.Driver");
			
			   String url = "jdbc:postgresql://localhost:5432/postgres";
			   String user = "postgres";
			   String password="Ramadevi@21";
			   con = DriverManager.getConnection(url, user, password);
			   int rowsaffected2=0;
	   String qry2 =" update public.users set password=? where user_id=?;";
	   ps2 = con.prepareStatement(qry2);
	   ps2.setString(1,"123456");
	   ps2.setInt(2,3);
	   rowsaffected2 += ps2.executeUpdate();
	   ps2.setString(1,"abcdef");
	   ps2.setInt(2,4);
	   rowsaffected2 += ps2.executeUpdate();
	   ps2.setString(1,"ABCDEF");
	   ps2.setInt(2,5);
	   rowsaffected2 += ps2.executeUpdate();
	 
	   System.out.println(" Affected Rows in the Table : "+ rowsaffected2);
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
	   if(ps2!= null) {
			
			try {
				ps2.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		}
}}