
public class Numbersfromstring {
	
	public static void main(String args[]){
		
	      int sum =0;
	  String str="sdfvsdf68fsdfsf8999fsdf09";
	   String numberOnly= str.replaceAll("[^0-9]","");
	 System.out.println(numberOnly);
	 char[] array= numberOnly.toCharArray();
	 for (int num :array){
			
			sum = sum+num;
	 }
		System.out.println("total "+sum);
}
}
	
