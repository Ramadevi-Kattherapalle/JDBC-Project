package JDBC;

public class LoadAndRegister {
public static void main(String[]args) {
	try {
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver is loaded and register successfully");
	}
	catch(ClassNotFoundException e){
		e.printStackTrace();
	}
}
}
