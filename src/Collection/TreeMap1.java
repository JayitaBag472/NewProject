package Collection;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMap1 {
	
	public static void main(String args[]){
		
		TreeMap<Integer,String> tm = new TreeMap<>();
		tm.put(1, "Red");
		tm.put(2, "Green");
		tm.put(3, "Black");
		tm.put(4, "White");
	    tm.put(5, "Blue");
	    
	   System.out.println(tm.get(1));
	   
	   for (Entry<Integer,String> entry : tm.entrySet()){
		   
		   System.out.println(entry.getKey() + "=>" + entry.getValue());
		   
	   }
		   
	   }
		
		
		
	}


