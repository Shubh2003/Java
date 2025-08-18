package jdbc;
import java.sql.*;


public class jdbc {
	public static void main(String args[]) throws Exception{
		
		String url = "";
		String username = "root";
		String password = "";
		
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, username, password);
	}
}
