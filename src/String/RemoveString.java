package String;

public class RemoveString {
	
	public static void main(String args[]){
		String str = "this is Java";
	      System.out.println(removeCharAt(str, 3));
	}

	private static String removeCharAt(String str, int pos) {
		return str.substring(0, pos) + str.substring(pos + 1);
	}

}
