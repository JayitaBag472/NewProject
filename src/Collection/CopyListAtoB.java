package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class CopyListAtoB {
	
	public static void main(String args[]){
		
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("A");
		al1.add("B");
		al1.add("C");
		System.out.println(al1);
		
		ArrayList<String> al2 = new ArrayList<>();
		al2.add("1");
		al2.add("2");
		al2.add("3");
		System.out.println(al2);
		
		Collections.copy(al1, al2);
		System.out.println(al1);
		System.out.println(al2);
		
		
		
	}

}
