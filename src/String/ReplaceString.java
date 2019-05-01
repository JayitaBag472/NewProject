package String;

public class ReplaceString {

	public static void main(String args[]){
		
		String str = "Hello World";
		System.out.println(str.replace("H", "W"));
		System.out.println(str.replaceAll("World","Jayita" ));
		System.out.println(str.replaceFirst("Hello", "Hi"));
	}
}
