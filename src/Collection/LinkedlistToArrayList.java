package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistToArrayList {
	
	public static void main(String[] args){
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("A");
		ll.add("B");
		ll.add("C");
		
		System.out.println(ll);
		
		ArrayList<String> al = new ArrayList<>(ll);
		
		for(String str:al){
			System.out.println(str);
		}
		
		
	}

}
