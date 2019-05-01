package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class array_list {

	public static void main(String args[]){
		ArrayList<String> al = new ArrayList<>();
		al.add("abcd");
		al.add("efgh");
		al.add("mnop");
		
		ListIterator li = al.listIterator();
		
		for (int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
	}
}
