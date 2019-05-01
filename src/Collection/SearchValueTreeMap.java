package Collection;

import java.util.TreeMap;

public class SearchValueTreeMap {
	
	public static void main(String args[]){
	
	TreeMap<Integer,String> tm = new TreeMap<>();
	tm.put(1, "Red");
	tm.put(2, "Green");
	tm.put(3, "Black");
	tm.put(4, "White");
    tm.put(5, "Blue");
    System.out.println(tm);
    
    //first (lowest) key and the last (highest) key currently in a map.
    Object o1 =tm.firstKey();
    System.out.println(o1);
    
    Object o2=tm.lastKey();
    System.out.println(o2);
    
    //get a key-value mapping associated with the greatest key and the least key in a map.
    
    Object o3=tm.lastEntry();
    System.out.println(o3);
    
    Object o4=tm.firstEntry();
    System.out.println(o4);
    
    //reverse order view of the keys contained in a given map
    
    Object o5 = tm.descendingKeySet();
    System.out.println(o5);
    
    if(tm.containsValue("Red")){
    	System.out.println("Value is present");
    }
    else
    {
    	System.out.println("Value is not present");
    }
    
    if (tm.containsValue("yellow")){
    	System.out.println("Value is present");
    }
    else
    {
    	System.out.println("Value is not present");
    }
    
    //get all keys from the given a Tree Map.
    Object o=tm.keySet();
    System.out.println(o);
    
   
	
	//delete one  element from a given Tree Map
	
tm.remove(1);
System.out.println(tm);

// delete all elements from a given tree Map

tm.clear();
System.out.println(tm);





	

}
}



