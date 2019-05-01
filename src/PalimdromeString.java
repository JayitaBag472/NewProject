
public class PalimdromeString {

	public static void main(String args[]){
		String str= "malayalam";
		
		StringBuffer str1 = new StringBuffer(str);
		
		str1.reverse();
		
		if(str.equals(str1.toString())){
			System.out.println("string is palimdrome");
			
		}else{
			System.out.println("String is not palimdrome");
		}
		
		
	}
}
