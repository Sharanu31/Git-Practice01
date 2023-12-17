package javaJDBCPractice.jDBC.practice;

import java.sql.*;

public class FetchingDataFromDB {

	public static void main(String[] args) throws Exception {

		String url = "jdbc:mysql://localhost:3307/aliens(dbname)";
		String uName = "Sharanu";
		String password = "Sharanu@321";
		String name = "";
		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection(url, uName, password);
		Statement st = con.createStatement();// to fetch a details form DB we will use 
		ResultSet rs = st.executeQuery("Select name from Student where place='Bangalore'");

		rs.next(); // after getting all the details it will be pointing to column by using next it
					// will point to data column

		name = rs.getString("name");

		System.out.println(name);

		// to print a multi rows form the table
		while (rs.next()) {
			name = rs.getInt(1) + " " + rs.getString(2);

			System.out.println(name);
		}
		st.close();
		con.close();
	}
}
