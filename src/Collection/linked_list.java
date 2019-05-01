package Collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class linked_list {
	
	

		public static void main(String args[]){
			
			LinkedList<String> ll = new LinkedList<>();
			ll.add("Monday");
			ll.add("Tuesday");
			ll.add("Wednesday");
			
			ListIterator li= ll.listIterator();
			
			for (int i =0;i<ll.size();i++){
				System.out.println(ll.get(i));
			}
			System.out.println("traversing elements in forward direction...");
			while(li.hasNext()){
			System.out.println(li.next());
			 }


			System.out.println("traversing elements in backward direction...");
			while(li.hasPrevious()){
			System.out.println(li.previous());
			 }
			
		
		LinkedList<String> ll1 = new LinkedList<>();
		ll1.add("Thursday");
		ll1.add("Friday");
		ll1.add("saturday");
		System.out.println(ll1);
		
		LinkedList<String> ll2= new LinkedList<>();
		ll2.addAll(ll);
		ll2.addAll(ll1);
		
		System.out.println(ll2);
		
		
		
		LinkedList<String> ll3 = new LinkedList<>();
		ll3=(LinkedList)ll2.clone();
		System.out.println(ll3);
		
		String x= ll3.peekFirst();
		System.out.println(x);
		System.out.println(ll3);
		
		String y = ll3.peekLast();
		System.out.println(y);
		System.out.println(ll3);
		
		if(ll3.contains("sunday")){
			System.out.println("day is present");
		}
		else
		{
			System.out.println("day is not presnt");
		}
		
		 
		
		}
			
		}
	


