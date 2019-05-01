package Collection;
/*Map--------------- key and value storage
HashMap--- thread not safe--new -- non synchronized
Hashtable---threadsafe-- legacy-- synchronized
*/



import java.util.HashMap;
import java.util.Hashtable;


public class Maps {


	
		
		public static void main(String args[]){
			HashMap<String,String>  m= new HashMap<String,String>();
			
			m.put("Name","Anand");
			System.out.println(m.get("Name"));
			
			Hashtable<String,Integer> m1= new Hashtable<String,Integer>();
			
			m1.put("Anand", 29);
			m1.put("abc",20);
			m1.put("abc",70);
			System.out.println(m1.get("abc"));
			
			Hashtable <String,Integer> m2 = new Hashtable <String,Integer>();
			
			m2.put("Q1", 29);
			m2.put("Q2", 20);
			m2.put("Q3", 28);
			System.out.println(m2.get("Q1"));
			
			Hashtable <String,Integer> m3 = new Hashtable <String,Integer>();
			
			m3.put("Q1", 21);
			m3.put("Q2", 22);
			m3.put("Q3", 25);
			
		Hashtable<String, Hashtable<String, Integer>> table = new Hashtable<String,Hashtable<String,Integer>>();
			
			table.put("A", m2);
			table.put("B",m3);
			System.out.println(table.get("A"));
			
		}

	}



