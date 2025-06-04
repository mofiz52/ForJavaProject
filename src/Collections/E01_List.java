package Collections;

import java.util.*;
//import java.util.ArrayList;
public class E01_List {

	public static void main(String[] args) {
	
		
		
		// List declare
		
		List<String> foodlist= new ArrayList<String>();	
		
		foodlist.add("Burger");
		foodlist.add("Soda");
		foodlist.add("Pizza");
		foodlist.add("Wing");
		foodlist.add("Tacco");
		foodlist.add("FriedCk");
		foodlist.add("BackedPotato");
		
		
		System.out.println(foodlist);
		for (String s:foodlist)
		System.out.println(s);
		// inset data in specific position
		foodlist.add(2, "Sanduch");
		System.out.println(foodlist);
		// replace data
		foodlist.set(4,"Rice");
		System.out.println(foodlist);
		// get data form a specific position
		System.out.println("Data from 4th position :"+foodlist.get(3));
		
		foodlist.add("Rice");
		System.out.println(foodlist);
		foodlist.remove(0);
		
		if (foodlist.contains("Rice"))
			System.out.println("Your Item exist");
		
		// delete all item use .clear() method
		foodlist.clear();
		System.out.println(foodlist);
		
	}

}
