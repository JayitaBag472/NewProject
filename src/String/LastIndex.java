package String;

public class LastIndex {
	
	public static void main(String args[]){
		
		String st1 = "Hello World,Hello world ,Hello Reader";
		int  st2 =st1.lastIndexOf("Hello");
		System.out.println(st2);
		
		if (st2== -1){
			System.out.println("Hello not found");
	      } else {
	         System.out.println("Last occurrence of Hello is at index "+ st2);
	      }
		String st3 = "Hello World,Hello world ,Hello Reader";
		int  st4 =st3.lastIndexOf("H");
		System.out.println(st4);
		
		String st5 = "Hello World";
		int  st6 =st5.lastIndexOf("e");
		System.out.println(st6);
		
		String st7 = "Hello World";
		int  st8 =st7.lastIndexOf("World");
		System.out.println(st8);
		
		}
	}


