
public class NullObject {
	
	public  void Show(){
	
	System.out.println("system is calling main method");
	
}
	
	public static void main(String args[]){
		
		NullObject obj = null;
		obj.Show();
		
	}
}


//Because at the compile time obj.Show() will be converted to NullObject.Show() since Show() is a static method.
