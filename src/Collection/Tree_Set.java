package Collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Tree_Set {

	public static void main(String args[]){
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add("Red");
		ts.add("Yellow");
		ts.add("Blue");
		
		Iterator<String> i = ts.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
	}
}
