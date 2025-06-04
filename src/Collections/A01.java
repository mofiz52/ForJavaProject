package Collections;

import java.util.*;

public class A01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> AmazonCart_One= new ArrayList<String>();
		
		AmazonCart_One.add("Samsungn 55 Inch TV");
		AmazonCart_One.add("JBL Sound Bar");
		AmazonCart_One.add("Table Lamp");
		AmazonCart_One.add("Echdo Dot");
		
		System.out.println("The product at the secound position :"+AmazonCart_One.get(2));
		AmazonCart_One.set(2, "Table Fan");
		//System.out.println(AmazonCart_One);
		
		List<String> AmazonCart_Two= new ArrayList<String>();
		AmazonCart_Two.add("Cleaning Mop");
		AmazonCart_Two.add("Yoga Mat");
		//System.out.println("AmazonCart_two is :"+AmazonCart_Two);
		
		List<String> AmazonCart_Final= new ArrayList<String>();
		AmazonCart_Final.addAll(AmazonCart_One);
		AmazonCart_Final.addAll(AmazonCart_Two);
		System.out.println("Number of Item in Final list is :"+AmazonCart_Final.size());
		for(String s:AmazonCart_Final)
		System.out.println(s);
		 if (AmazonCart_Final.contains("Yoga Mat"))
		 	System.out.println("Item Found");
		 else
			 System.out.println("Item not Found"); 
		 
		//testing jenkins test run
		
		
		
	}

}
