package Collections;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class E04_Collection_List {

	public static void main(String[] args) {
	
		
	List<Integer>  linkedlist=new ArrayList();
	
	linkedlist.add(2);
	linkedlist.add(12);
	linkedlist.add(22);
	linkedlist.add(23);
	linkedlist.add(32);
	linkedlist.add(42);
	linkedlist.add(02);
	
	System.out.println(linkedlist);
	Collections.sort(linkedlist);
	System.out.println(linkedlist);
	Collections.reverse(linkedlist);
	System.out.println(linkedlist);
	System.out.println(Collections.frequency(linkedlist, 2));
	}

}
//