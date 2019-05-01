package Collection;
import java.util.Collections;
import java.util.LinkedList;

import Collection.LinkedList1;

public class Linkedlist2 {
	
	public static void main(String[] args){
	
		//insert some elements at the specified position into a linked list.
		LinkedList<String> ll = new LinkedList<>();
		ll.add("A");
		ll.add("B");
		ll.add("C");
		System.out.println(ll);
		
		LinkedList<String> ll1 = new LinkedList<>();
		ll1.add("X");
		ll1.add("Y");
		System.out.println(ll1);
		
	ll.addAll(1, ll1);
	
	System.out.println(ll);
	
	//get the first and last occurrence of the specified elements in a linked list.
	
			Object o= ll.getFirst();
			System.out.println(o);
			
			Object o1=ll.getLast();
			System.out.println(o1);
			
			System.out.println(ll);
			
			//swap two elements in an linked list.
			Collections.swap(ll, 0, 1);
			System.out.println(ll);
			
			//shuffle the elements in a linked list.
			
			Collections.shuffle(ll1);
			System.out.println(ll);
			
			
			
	
	
		
	}

}
