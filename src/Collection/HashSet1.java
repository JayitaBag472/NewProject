package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
	
	public static void main(String args[]){
		HashSet<String> hs = new HashSet<>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		System.out.println(hs);
		
		//to get the number of elements in a hash set
		System.out.println(hs.size());
		
		//empty an hash set
		hs.removeAll(hs);
		System.out.println(hs);
		
		if(hs.isEmpty()){
			System.out.println("list is empty");
		}
		
		else{
			System.out.println("list is not empty");
		}
		
		//iterate through all elements in a hash list.
		/*Iterator<String> i = hs.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
		}*/
	}

}
