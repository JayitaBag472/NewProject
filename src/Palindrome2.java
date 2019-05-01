
public class Palindrome2 {
	
	public static void main(String args[]){
		
		String str = "abcousqwdiu";
		String reverse = "";
		
		char[] chararray = str.toCharArray();
		
		for(int i= chararray.length-1;i>=0;i--){
			reverse = reverse+chararray[i];
		System.out.println(str);	
		System.out.println(reverse);
		
		
		if(str.equals(reverse)){
			System.out.println("String is palindrome");
		}
		else{
			System.out.println("String is palindrome");
		}
	}
}


}