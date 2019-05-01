package Collection;

import java.util.HashMap;

public class hash_Map {
	
	public static void main(String args[]){
		
		HashMap <String,Integer> hm = new HashMap<>();
		
		hm.put("Jayita", 29);///key and value
		System.out.println(hm.get("Jayita"));
		//System.out.println(hm.get("29"));
		
		HashMap <Integer,String> hm1 = new HashMap<>();
		
		hm1.put(29, "Jayita");///key and value
		System.out.println(hm.get("Jayita"));
		
		
		
	}

}
