package String;

public class Compare {
	
	public static void main(String args[]){
		
		String str1 = "Hello World";
		String str2 = "hello world";
		String str3 =  "Hello World";
		Object objstr = str1;
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.toString());
		System.out.println( str1.compareTo(objstr.toString()));
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		
		 String s1 = new String("HELLO WORLD");
	        String s2 = new String("HELLO WORLD");
	        System.out.println(s1 == s2);
	        System.out.println(s1.equals(s2));
		
	}

}
