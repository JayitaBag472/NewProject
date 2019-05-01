
public class array {
	
	public static void main(String args[]){
		
		int[] array= new int[4];
		array[0]= 9;
		array[1]= 6;
		array[2]= 2;
		array[3]= 4;
		
		int len = array.length;
		
		System.out.println(len);
		
		
		for (int i=0;i<array.length;i++){
			
			System.out.println(array[i]);
		}
		
		
		for (int i = 0; i < 5-1 ; i++) 
        {
            System.out.print(array[i] + ",");
        }
		
		System.out.println(array[4]);
	}

}
