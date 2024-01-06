package lec05_01_java_variables;

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
	// Constructor is declared/defined
	public MyInfo() {
		System.out.println("I am a Constructor");
	}
	
	// This is a void type method
	// method name start with lower case and follow camel case or snake case feature
	// method implemented inside a class
	// implemented means: they have method body what we see inside curly braces
	public void taxiService() {
		System.out.println("I am a taxi method");
		System.out.println("My Name: " + myName + "\nMy Bank balance: "+myBankBalance);
	}
	
	public void uber_service() {
		System.out.println("I am an uber method");
	}
	
	// method name can be same as class name, but in lower case
	// but, this is not mandatory to make a method name same as class name
	public void myInfo() {
		System.out.println("My Name: " + myName + "\nMyAge: " + myAge);
		System.out.println("I am myInfo Method");
		System.out.println(myApartmentRent);
		System.out.println("Apartment Rent: " + myApartmentRent);
		System.out.println("Apartment Rent: " + myApartmentRent + "\nMy Gender: " + myGender);
	}
	
	
	
	

}
