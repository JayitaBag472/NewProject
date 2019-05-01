package Collection;

import java.util.TreeSet;

public class GreaterOrEqualTreeSetElement {
	
	public static void main(String[] args){
		
		TreeSet<Integer> tree_num = new TreeSet<>();
		tree_num.add(10);
		   tree_num.add(22);
		   tree_num.add(36);
		   tree_num.add(25);
		   tree_num.add(16);
		   tree_num.add(70);
		   tree_num.add(82);
		   tree_num.add(89);
		   tree_num.add(14);
		//less than or equal to the given element.
		System.out.println(tree_num.floor(86));
		// greater than or equal to the given element.
		System.out.println(tree_num.ceiling(86));
		
		//ree set which is strictly greater than or equal to the given element.
		System.out.println(tree_num.higher(86));
		
		//tree set which is strictly less than the given element.
		System.out.println(tree_num.lower(86));
		
		//retrieve and remove the first element of a tree set. 
		System.out.println(tree_num.pollFirst());
		System.out.println(tree_num);
		
		// retrieve and remove the last element of a tree set. 
		System.out.println(tree_num.pollLast());
		System.out.println(tree_num);
		
		//remove a given element from a tree set.
		System.out.println(tree_num.remove(70));
		System.out.println(tree_num);
	}

}
