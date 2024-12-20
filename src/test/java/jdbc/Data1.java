package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Data1 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		String dbURL="jdbc:mysql://localhost:3306/advsel"; // PATH OF THE DB
		Class.forName("com.mysql.cj.jdbc.Driver"); // connector file path to db
		
		try {
			DriverManager.getConnection(dbURL,"root","root");
			System.out.println("connection established");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("connection not established");
		}
		
	}

}
