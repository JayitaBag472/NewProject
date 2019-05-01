package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class CompareArrayList {
	
	private static boolean bolean;

	public static void main(String args[]){
		
		ArrayList<String> al = new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		
		System.out.println(al);
		
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("A");
		al1.add("B");
		al1.add("1");
		al1.add("D");
		System.out.println(al1);
		
		
		
		// compare two arrays
		ArrayList<String> al2 = new ArrayList<>();
		for(String s : al){
		al2.add(al1.contains(s)? "YES" : "No");
		System.out.println(al2);
		}
		
		// join two arrays
		ArrayList<String> al3 = new ArrayList<>();
		al3.addAll(al);
		al3.addAll(al1);
		System.out.println(al3);
		
		//clone one array to another
		
		ArrayList<String> al4 = (ArrayList<String>)al1.clone();
		System.out.println(al4);
		
		//empty an array list
		al1.removeAll(al1);
		System.out.println(al1);
		
		if(al1.removeAll(al1)){
			System.out.println("array is empty"+al1);
		}
		else
		{
			System.out.println("array is not empty"+al1);
		}
		
		
		
		
		
	}

}
