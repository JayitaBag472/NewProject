package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetToArray {
	
	public static void main(String args[]){
		
		HashSet<String> hs = new HashSet<>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		System.out.println("Hashset array"+hs);

		ArrayList<String> al = new ArrayList<>(hs);
		
		for(String str : al){
			System.out.println("ArrayList array"+str);
		}
		
	}
	

}
