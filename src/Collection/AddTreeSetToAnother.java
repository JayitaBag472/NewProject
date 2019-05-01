package Collection;

import java.util.TreeSet;

public class AddTreeSetToAnother {
	
	public static void main(String[] args){
		
		TreeSet<String> ts = new TreeSet<>();
		ts.add("Red");
		ts.add("White");
		ts.add("Blue");
		System.out.println(ts);
		//get the number of elements in a tree set. 
		System.out.println(ts.size());
		
		
		TreeSet<String> ts1 = new TreeSet<>();
		ts1.add("Pink");
		ts1.add("yellow");
		ts1.add("Black");
		System.out.println(ts1);
		
		
		ts.addAll(ts1);
		
		System.out.println("elements are added"+ts);
		
		//get the first and last elements in a tree set.
		Object o = ts.first();
		System.out.println(o);
		
		Object o1 = ts.last();
		System.out.println(o1);
		
		
	}

}
