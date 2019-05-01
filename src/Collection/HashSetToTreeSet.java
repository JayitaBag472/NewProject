package Collection;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetToTreeSet {
	
	public static void main(String args[]){
		
		HashSet<String> hs = new HashSet<>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		
		System.out.println("Hashset array"+hs);
		
		TreeSet<String> ts = new TreeSet<>(hs);
		for(String str : ts){
			System.out.println("Treeset array"+str);
		}
		
		
	}

}
