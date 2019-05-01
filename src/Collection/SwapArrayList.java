package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayList {
	
	public static void main(String[] args){
	
		ArrayList<String> al = new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		
		System.out.println(al);
		
	//swap element with indexes 	
	Collections.swap(al, 0, 1);
	System.out.println(al);
		
	//replace the second element of a ArrayList with the specified element
		Collections.replaceAll(al, "B", "D");
		System.out.println(al);
	
}

}
