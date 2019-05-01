package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHash_Set {
	
	public static void main(String args[]){
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		
		lhs.add("A");
		lhs.add("B");
		lhs.add("C");
		
		Iterator<String> i = lhs.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}

}
