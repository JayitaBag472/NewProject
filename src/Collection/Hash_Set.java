package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {
	
	public static void main(String args[]){
		
		HashSet<String> hs = new HashSet<>();
		
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("A");
		
		Iterator<String> st = hs.iterator();
		
		while(st.hasNext()){
			System.out.println(st.next());
			
			
			
		}
		
	}

}
