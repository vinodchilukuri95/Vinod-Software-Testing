package MySQL_Project;

import java.sql.*;

public class Tree {
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tree1","root","root");
			Statement stmt=(Statement) con.createStatement();
			System.out.println("inserting records");
			String sql="Insert into fruit value(67)";
			((java.sql.Statement) stmt).executeUpdate(sql);
			}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}
