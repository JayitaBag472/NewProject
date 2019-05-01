package Collection;

import java.util.TreeMap;

public class SearchKeyTreeMap {
	
	public static void main(String args[]){
		
		TreeMap<Integer,String> tm = new TreeMap<>();
		tm.put(1, "Red");
		tm.put(2, "Green");
		tm.put(3, "Black");
		tm.put(4, "White");
	    tm.put(5, "Blue");
	    System.out.println(tm);
	    
	    if(tm.containsKey(1)){
	    	System.out.println("key is present");
	    }
	    else
	    {
	    	System.out.println("Key is not present");
	    }
	    
	    if (tm.containsKey(6)){
	    	System.out.println("key is present");
	    }
	    else
	    {
	    	System.out.println("Key is not present");
	    }
	    }
	}

	

