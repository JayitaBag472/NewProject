import org.testng.annotations.Test;

public class DataProvider {
	
	@Test(dataProvider="getData")
	public void Test2(String name,int rollnumber,String address, int phonenumber){
		System.out.println(name+' '+rollnumber+' '+address+' '+phonenumber);
		
	}
	
	public Object[][] getData(){
		
		Object[][] data= new Object[3][4];
		
		//Row1
				data[0][0]="User1";
				data[0][1]=498327;
				data[0][2]="add1";
				data[0][3]=12345;
				
				//Row 2

				data[1][0]="User2";
				data[1][1]=8907;
				data[1][2]="add2";
				data[1][3]=890769;
				
				//Row 3

				data[2][0]="User3";
				data[2][1]=34345;
				data[2][2]="add3";
				data[2][3]=786534;	
				
		return data; 
		
	}

}
