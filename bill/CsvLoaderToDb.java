package com.onebill.shoppingcartbill.bill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CsvLoaderToDb {
	
public static void main(String[] args) {
	Connection connection = null;
	Statement statement = null;
	ResultSet result = null;
	String dburl = "jdbc:mysql://localhost:3306/shoppingcart?user=root&password=abcd";
	try{
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection(dburl);
		String query = "select * from customerdetails where Subscriber_Account_number='SR1101'";

		statement = connection.createStatement();
		result = statement.executeQuery(query);
		while (result.next()) {
			System.out.println(result.getString("Subscriber_Account_number"));
			System.out.println(result.getString("Product_Name"));
			System.out.println(result.getString("Price_Plan_Name"));
			System.out.println(result.getString("Subscription_Identifier"));
			System.out.println(result.getString("Subscription_Quantity"));
		}
	}catch(
	Exception e)
	{
		e.printStackTrace();
	}

}
}
