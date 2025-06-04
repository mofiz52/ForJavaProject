package Collections;

import java.util.LinkedList;

public class E02_LinkedList {

	public static void main(String[] args) {
		
		
		LinkedList<String> linkedlist=new LinkedList();
		linkedlist.add("Apple");
		linkedlist.add("Orange");
		linkedlist.add("Banana");
		linkedlist.add("Straberry");
		linkedlist.add("Blueberry");
		
		System.out.println(linkedlist);
		linkedlist.addFirst("Peach");
		linkedlist.addLast("Pear");
		System.out.println(linkedlist);
	//	linkedlist.se
		
		

	}

}
