package Strings;

public class ExtractNumberfromStringAndAdd {
	
	public static void main(String args[]){
		

String a = "jklmn489pjro635ops";

  

int sum = 0;

for(int i = 0; i < a.length(); i++) {
    if(Character.isDigit(a.charAt(i))) {
        sum = sum + Integer.parseInt(a.charAt(i) + "");
    } 
}

System.out.println(sum);
	    }}