
public class MainYVIPCustomer {
	
	public static void main(String args[]){
		
		VIPcustomer jayitaAccount = new VIPcustomer();
		System.out.println(jayitaAccount.getcreditlimit());
		System.out.println(jayitaAccount.getname());
		System.out.println(jayitaAccount.getemail());
		
		
		VIPcustomer jayitaAccount1 = new VIPcustomer("ayan",9000);
		System.out.println(jayitaAccount1.getemail());
		System.out.println(jayitaAccount.getcreditlimit());
		System.out.println(jayitaAccount1.getname());
		//System.out.println(jayitaAccount.getcreditlimit());
		
		VIPcustomer jayitaAccount2 = new VIPcustomer("abc",10000,"kir@gmail.com");
		System.out.println(jayitaAccount2.getemail());
		System.out.println(jayitaAccount2.getcreditlimit());
		System.out.println(jayitaAccount2.getname());
		//System.out.println(jayitaAccount.getcreditlimit());
		
		
		
		
	}
}


