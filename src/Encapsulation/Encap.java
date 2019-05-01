package Encapsulation;

public class Encap {

	private String name;
	private String idNum;
	private int age;
	
	public String getName(){
		return name;
	}
	public String getIDNumber(){
		return idNum;
	}
	public int getAge(){
		return age;
	}
	public void setName(String newName){
		 name= newName;
	}
	public  void setIDNumber(String newNumber){
		idNum = newNumber;
	}
	public void setAge(int neAge){
		age= neAge;
	}
	
}
