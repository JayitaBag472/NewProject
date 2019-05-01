package Collection;

import java.util.LinkedList;

public class CompareTwoLinkedlist {
	
	public static void main(String[] args){
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("A");
		ll.add("B");
		ll.add("C");
		
		System.out.println(ll);
		
		LinkedList<String> ll1 = new LinkedList<>();
		ll1.add("A");
		ll1.add("B");
		ll1.add("D");
		
		System.out.println(ll1);
		
		LinkedList<String> ll2 = new LinkedList<>();
		
		for(String str : ll){
			ll2.add(ll1.contains(str) ? "YES" : "NO");
			System.out.println(ll2);
			}
		
		if(ll2.isEmpty()){
			System.out.println("list is empty");
		}
		else{
			System.out.println("list is not empty");
			
		}
		
		ll1.set(0, "G");
		System.out.println(ll1);
		}
	
	  
		
	}


