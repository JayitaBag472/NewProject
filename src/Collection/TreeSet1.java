package Collection;

import java.util.TreeSet;

public class TreeSet1 {
	
	public static void main(String[] args){
	
		
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(1);
		ts.add(40);
		ts.add(7);
		ts.add(3);
		System.out.println(ts);
		
		
		//find the numbers less than 7 in a tree set.
		TreeSet<Integer> ts1 = new TreeSet<>();
		ts1=(TreeSet)ts.headSet(7);
		
		System.out.println(ts1);
		
	
		
		
	}

}
