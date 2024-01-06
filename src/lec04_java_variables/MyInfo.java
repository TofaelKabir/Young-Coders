package lec04_java_variables;

public class MyInfo {
	// variables initialized
	public String myName = "Alex Fergunson";
	public byte myAge = 78;
	public short myApartmentRent = 20000;
	public int myYearlySalary = 876438726;
	public long myBankBalance = 8276587365876l; // we must have to use lower case L (l), at the end of long value
	public float myHeight = 1.6541f; // we must have to use lower case f, at the end of float value
	public double myGrade = 3.36546735;
	public char myGender = 'M';
	public boolean usCitizen = false;
	
	// This is a Constructor
	// Constructor name is same as Class Name
	public MyInfo() {
		System.out.println("I am a Constructor");
	}
	
	
	public static void main(String[] args) {
		MyInfo book = new MyInfo();
		
		

		
	}
	
	
	
	

}
