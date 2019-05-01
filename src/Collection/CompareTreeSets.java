package Collection;

import java.util.TreeSet;

public class CompareTreeSets {
	
	public static void main(String[] args){
		
		TreeSet<String> ts = new TreeSet<>();
		ts.add("Red");
		ts.add("Blue");
		ts.add("White");
		System.out.println(ts);
		
		TreeSet<String> ts1 = new TreeSet<>();
		ts1.add("Red");
		ts1.add("Blue");
		ts1.add("Yellow");
		System.out.println(ts);
		
		TreeSet<String> ts2 = new TreeSet<>();
		
		for(String str : ts){
			ts2.add(ts1.contains(str) ? "YES" : "NO");
			System.out.println(ts2);
		}
	}

}
