 package com.onebill.shoppingcartbill.bill;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.UUID;

public class ProductSubscription {

	public static void main(String[] args) {
		Scanner scn =new Scanner (System.in);
		System.out.println("enter AccountNumber");
		String accountNumber=scn.nextLine();
		String uniqueID=UUID.randomUUID().toString();
		try {	
			FileReader file = new FileReader("C:\\Users\\SINDHU\\OneDrive\\Desktop\\onebill\\shoppingcartbill\\src\\com\\onebill\\shoppingcartbill\\bill\\Subscriptions (3) (1).csv");
			BufferedReader csvReader = new BufferedReader(file);
			//FileWriter writer=new FileWriter("C:\\Users\\SINDHU\\OneDrive\\Desktop\\onebill\\Subscriptions (3) (1).csv");
			
			String row="";
			String[] temp;

			while ((row = csvReader.readLine())!= null) {
				if(accountNumber.equals(row.substring(0,6))) {
				String[] data = row.split(",");
				System.out.println(row);
				
				
				
			}		
				
			}
			

		} catch (Exception e) {
	
			e.printStackTrace();
		}
	}
}
