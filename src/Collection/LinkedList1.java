package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
	
	public static void main(String args[]){
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Red");
		ll.add("Blue");
		ll.add("Orange");
		
	Iterator it = ll.iterator();
	
	//display the elements and their positions in a linked list.
	for (int i=0;i<ll.size();i++){
		System.out.println("elements display"+i+ll.get(i));
		
	}
		
		System.out.println(ll);
		
		//iterate through all elements in a linked list starting at the specified position.
		
		Iterator it1 = ll.listIterator(2);
		
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		
		//iterate a linked list in reverse order
		Iterator it2 = ll.descendingIterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		
		// insert the specified element at the specified position in the linked list. 
		
		ll.add(1, "Black");
		System.out.println(ll);
		
		// insert element in first and last position
		
		ll.addFirst("Pink");
		ll.addLast("white");
		System.out.println(ll);
		
		//insert the specified element at the front of a linked list
		
		ll.offerFirst("a");
		System.out.println(ll);
		
		//insert the specified element at the last of a linked list
		
		ll.offerLast("Z");
		System.out.println(ll);
		
		//remove a specified element from a linked list
		ll.remove("a");
		System.out.println(ll);
		
		//remove first and last element from a linked list.
		ll.removeLast();
		ll.removeFirst();
		System.out.println(ll);
		
		
		//remove all the elements from a linked list. 
		ll.removeAll(ll);
		System.out.println(ll);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
