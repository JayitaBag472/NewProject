package String;

public class splitString {

		   public static void main(String args[]) {
		      String s1 = "jan-feb-march"; 
		      String[] words = s1.split("\\s"); 
		      for(String w:words) {
		         System.out.println(w);  
		      }  
		   }
		}


