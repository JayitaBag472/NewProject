

public class ReverseSentence {
	
	public static void main(String args[])
	{
	
		    String str[] = "I am a boy".split(" ");
		   
	String str2= "";
		        for(int i = str.length-1; i>= 0 ;i--){
		        str2 += str[i]+" ";
		        }
		        System.out.println(str2);
		    }
	
		}
	