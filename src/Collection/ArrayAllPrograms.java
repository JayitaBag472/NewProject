package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayAllPrograms {
	
	public static void main(String args[]){
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Red");
		al.add("Blue");
		al.add("Black");
		
		// print elements according to their index
		
		Iterator li = al.iterator();
		
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		
		System.out.println(al);
		
		// insert element in first index
		
		al.add(0,"Yellow");
		
		// insert element in last index
		
		al.add(4,"Pink");
		
		System.out.println(al);
		
		
		//retrieve an element (at a specified index) from a given array list.
		String  colour = al.get(0);
		System.out.println(colour);
		
		
		//update specific array element by given element.
		String colour2=al.set(2, "Orange");
		System.out.println(al);
		
		//remove specific array element by given element.
		String colour3 = al.remove(3);
		System.out.println(al);
		
		
		//search an element in a array list
		
		if(al.contains("Pink")){
			System.out.println("list is having colour");
		}
		else
		{
			System.out.println("list is not having colour");
		}
		
		
		//sort elements in an array list
		
		Collections.sort(al);
		System.out.println(al);
		

		
		
	 
	   
		
		
		
		
	}

}
