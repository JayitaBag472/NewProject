import java.util.HashMap;  
import java.util.Map;  
import java.util.Set;  
   
public class DuplicateCharactersfromString{  
    public void findIt(String str) {  
        Map<Character, Integer> Map = new HashMap<Character, Integer>();  
        char[] charArray = str.toCharArray();  
        for (Character ch : charArray) {  
            if (Map.containsKey(ch)) {  
                Map.put(ch, Map.get(ch) + 1);  
            } else {  
                Map.put(ch, 1);  
            }  
        }  
        Set<Character> keys = Map.keySet();  
        for (Character ch : keys) {  
            if (Map.get(ch) > 1) {  
                System.out.println(ch + "  is " + Map.get(ch) + " times");  
            }  
        }  
    }  
   
    public static void main(String a[]) {  
    	DuplicateCharactersfromString dcf = new DuplicateCharactersfromString();  
        dcf.findIt("stre1234sssttrre1111222333444");  
    }  
}  

