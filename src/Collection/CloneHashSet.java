package Collection;

import java.util.HashSet;

public class CloneHashSet {
	
	public static void main(String[] args){
		
		HashSet<String> hs = new HashSet<>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		System.out.println(hs);
		
		
		HashSet<String> hs1 = new HashSet<>();
		
		//clone a hash set to another hash set
		hs1 = (HashSet)hs.clone();
		System.out.println(hs1);
		
		//remove all of the elements from a hash set.
		hs1.removeAll(hs1);
		System.out.println(hs1);
		
	}

}
