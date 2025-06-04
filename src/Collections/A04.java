package Collections;
import java.util.*;
public class A04 {

	public static void main(String[] args) {
		
		
		Map<String , Integer> empProject= new HashMap<String, Integer>();
		
		empProject.put("EMP 101",8 );
		empProject.put("EMP 102",1 );
		empProject.put("EMP 103",8);
		empProject.put("EMP 104",1 );
		empProject.put("EMP 105",8 );
		
		List<Integer> list=new ArrayList();
		 list.addAll(empProject.values());
		 int max=Collections.max(list);
		 int min=Collections.min(list);
		 
		 Set<String> set=new TreeSet();
		 set.addAll(empProject.keySet());
		System.out.println("Person who is working for the maximum number of Project");
		for(String s:set) {
			if (empProject.get(s)==max)
				System.out.println(s);		
		}
		
		System.out.println("Person who is working for the minimum number of Project");
		for(String s:set) {
			if (empProject.get(s)==min)
				System.out.println(s);	
		}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               

	}

}
