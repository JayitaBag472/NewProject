package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class HashSetToLinkedList {
	
public static void main(String args[]){
		
		HashSet<String> hs = new HashSet<>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		System.out.println("Hashset array"+hs);

		LinkedList<String> al = new LinkedList<>(hs);
		
		for(String str : al){
			System.out.println("Linkedlist array"+str);
		}
		
	}

}
