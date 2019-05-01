package Collection;

import java.util.TreeSet;

public class CloneTreeSet {
	
	public static void main(String[] args){
		
		TreeSet<String> ts = new TreeSet<>();
		ts.add("A");
		ts.add("Z");
		ts.add("M");
		
		System.out.println(ts);
		
		TreeSet<String> ts1 = new TreeSet<>();
		ts1 = (TreeSet<String>)ts.clone();
		System.out.println(ts1);
		
	}

}
