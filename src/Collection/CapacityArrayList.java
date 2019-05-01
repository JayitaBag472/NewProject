package Collection;

import java.util.ArrayList;

public class CapacityArrayList {

	public static void main (String args[]){
		
		ArrayList<String> al = new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		System.out.println(al);
	
		// trim the size of array 
		
		al.trimToSize();
		System.out.println(al);
		
		// increase the capacity of array
		al.ensureCapacity(6);
		al.add("D");
		al.add("E");
		al.add("F");
		al.add("G");
		al.add("H");
		al.add("H");
		al.add("H");
		al.add("H");
		
		System.out.println(al);
		
		
	}
	
}
