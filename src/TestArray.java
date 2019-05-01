
public class TestArray {
	
	public static void main(String[] args){
		
		double[] mylist= {1.9,2,5,9,7,6};
		for (int i =0;i<mylist.length;i++){
			System.out.println(mylist[i]);
		}
		
		int total =0;
		for (int i =0;i<mylist.length;i++){
			total+= mylist.length;
			System.out.println(total);
		}
		
		double max=mylist[0];
		for (int i =0;i<mylist.length;i++){
			if(mylist[i]>max)max= mylist[i];
			  
		}
		 System.out.println("Max is " + max); 
	}

}
