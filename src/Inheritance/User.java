package Inheritance;


public class User {
	
	public static void main(String args[]){

	SmartPhone st= new SmartPhone();
	st.calling();
	st.UserFriendly();
	st.dialing();
	
	
	Phone p = new Phone();
	p.calling();
	p.dialing();
	
    Mobile m = new Mobile();
    m.calling();
    m.texting();
    m.dialing();
    
    p = new Mobile();
    
}
}
