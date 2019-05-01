package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleReverseAL {
	
	public static void main(String args[]){
		
		ArrayList<String> al = new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		
		System.out.println(al);
		
		
		//extract portion of an array
		  List<String> al1= al.subList(0, 2);
		   System.out.println(al1);
		
		// shuffle elements in array
		Collections.shuffle(al);
		System.out.println(al);
		
		// reverse elements of array
		Collections.reverse(al);
		System.out.println(al);
		
	
		
		
		
	}

}
