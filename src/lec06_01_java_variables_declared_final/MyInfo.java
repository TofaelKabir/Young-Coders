package lec06_01_java_variables_declared_final;

public class MyInfo {
	// variables declared
	public String myName;
	public byte myAge;
	public short myApartmentRent;
	public int myYearlySalary;
	public long myBankBalance; 
	public float myHeight;
	public double myGrade;
	public char myGender;
	public boolean usCitizen;
	
	// Constructor is declared/defined
	public MyInfo() {
		System.out.println("---- :This is All about me: ----");
	}
	
	// This is a void type method implemented here
	public void myInfo() {
		System.out.println("Name: " + myName + "\nAge: " + myAge + "\nApartment Rent: " + myApartmentRent
				+ "\nYearly Salary: " + myYearlySalary + "\nBank Balance: " + myBankBalance + "\nGender: " + myGender
				+ "\nHeight: " + myHeight + "\nGrade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);
	}	
	
	/*
	 You must know it:
	 Default value of String is null 
	 Default value of byte is 0
	 Default value of short is 0
	 Default value of int is 0
	 Default value of long is 0
	 Default value of float is 0
	 Default value of double is 0
	 Default value of char is an unicode which is not defined by eclipse IDE
	 Default value of boolean is false 
	 
	 Here, you must know for String, int, boolean
	 */

	// Generally we use 4-5 types of variable
	// They are: String, int, char, boolean and float
	
}
