package Collections;
import java.util.*;
public class E05_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> foodSet= new HashSet<String>();
		List<String> foodList=new ArrayList<String>();
		foodList.add("Rice");
		foodList.add("Burger");
		foodList.add("Fries");
		foodList.add("Potato");
		foodList.add("Vegi");
		foodList.add("Rice");
		
		foodSet.addAll(foodList);
		System.out.println(foodSet);
		Set<Integer> foodSet1= new HashSet<Integer>();
		foodSet1.add(23);
		foodSet1.add(2);
		foodSet1.add(22);
		foodSet1.add(90);
		foodSet1.add(9);
		foodSet1.add(20);
		System.out.println(foodSet1);
		Set<Integer> foodSet2= new LinkedHashSet<Integer>(); // save the data as it was imputed 
		foodSet2.add(23);
		foodSet2.add(2);
		foodSet2.add(22);
		foodSet2.add(90);
		foodSet2.add(9);
		foodSet2.add(20);
		System.out.println(foodSet2);
		
		Set<Integer> foodSet3= new TreeSet<Integer>(); 
		
		foodSet3.add(23);
		foodSet3.add(2);
		foodSet3.add(22);
		foodSet3.add(90);
		foodSet3.add(9);
		foodSet3.add(20);
		System.out.println(foodSet3);
		
		
		
	}

}
