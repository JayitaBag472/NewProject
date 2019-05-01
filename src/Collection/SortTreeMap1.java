package Collection;

import java.util.Comparator;
import java.util.TreeMap;

public class SortTreeMap1 {
	
	public static void main(String[] args){
		
		TreeMap<String,String> tm = new TreeMap<>();
		 tm.put("C2", "Red");
		  tm.put("C4", "Green");
		  tm.put("C3", "Black");
		  tm.put("C1", "White");
		  
		  System.out.println(tm);
		  
		  class sort_key implements Comparator<String>{
			     @Override
			    public int compare(String str1, String str2) {
			        return str1.compareTo(str2);
			    }
			     
			}
		 
		
	}

}
