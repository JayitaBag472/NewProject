package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListToLinkedList {
	
	public static void main(String[] args){
		
		ArrayList<String> al = new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
		
		System.out.println(al);
		
		LinkedList<String> ll = new LinkedList<>(al);
		
		for(String str :ll){
			System.out.println(str);
		}
	}

}
