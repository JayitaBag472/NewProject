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
	
	
		
	}

}
