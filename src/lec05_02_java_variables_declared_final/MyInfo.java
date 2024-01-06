package lec05_02_java_variables_declared_final;

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
		System.out.println("---- :This is All about me: ----");
	}
	
	// This is a void type method
	// method name start with lower case and follow camel case or snake case feature
	// method implemented inside a class
	// implemented means: they have method body what we see inside curly braces	
	// method name can be same as class name, but in lower case
	// but, this is not mandatory to make a method name same as class name
	public void myInfo() {
		System.out.println("Name: " + myName + "\nAge: " + myAge + "\nApartment Rent: " + myApartmentRent
				+ "\nYearly Salary: " + myYearlySalary + "\nBank Balance: " + myBankBalance + "\nGender: " + myGender
				+ "\nHeight: " + myHeight + "\nGrade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);
	}	
	
}
