package javaJDBCPractice.jDBC.practice;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertingDataInToDB {

	public static void main(String[] args) throws Exception {

		String url = "";
		String name = "";
		String pass = "";
		int userID = 6;
		String userName = "Sandy";
		String query = "insert into student (?,?)";

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection(url, userName, pass);
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, userID);
		st.setString(1, userName);

		int count = st.executeUpdate();

		st.close();
		con.close();
	}

}
