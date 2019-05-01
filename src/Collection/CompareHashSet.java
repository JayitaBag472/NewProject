package Collection;

import java.util.HashSet;

public class CompareHashSet {
	
	public static void main(String[] args){
		
		HashSet<String> hs = new HashSet<>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		
		System.out.println(hs);
		
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("A");
		hs1.add("B");
		hs1.add("C");
		
		System.out.println(hs1);
		
       HashSet<String> hs2 = new HashSet<>();
       //compare two sets 
       for(String str : hs){
    	   hs2.add(hs1.contains(str) ? "YES" : "NO");
    	   
    	   System.out.println(hs2);
       }
      
       //retain elements which are same on both sets.
       hs.retainAll(hs1);
       System.out.println(hs);
       
	}

}
