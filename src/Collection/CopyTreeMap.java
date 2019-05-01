package Collection;

import java.util.TreeMap;

public class CopyTreeMap {
	
	public static void main(String args[]){
	
	TreeMap<Integer,String> tm = new TreeMap<>();
	tm.put(1, "Red");
	tm.put(2, "Green");
	tm.put(3, "Black");
	tm.put(4, "White");
    tm.put(5, "Blue");
    
    System.out.println(tm);
    
	TreeMap<Integer,String> tm1 = new TreeMap<>();
	tm1.put(6, "Yellow");
	tm1.put(7, "Pink");
	
    
    System.out.println(tm1);
    
    tm.putAll(tm1);
    
    System.out.println(tm);
    
	

}
}
