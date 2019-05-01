package Collection;

import java.util.Iterator;
import java.util.TreeSet;



public class ReverseTreeSet {
	
	public static void main(String[] args){
		
		TreeSet<String> ts = new TreeSet<>();
		ts.add("Red");
		ts.add("White");
		ts.add("Blue");
		
		Iterator<String> i = ts.descendingIterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
	}

}
