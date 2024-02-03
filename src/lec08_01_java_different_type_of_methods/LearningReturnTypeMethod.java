package lec08_01_java_different_type_of_methods;

public class LearningReturnTypeMethod {
	// Global variable or class variable
	public int a = 43;
	public int b = 21;
	
	protected String firstName = "Alex";
	String lastName = "Fergunson"; // Here access modifier is 'default'
	
	// void type method
	public void addition () {
		int sum = a + b; // local variable
		System.out.println("Addition of a and b is: " + sum);
	}
	
	// return type method which is returning int data type
	// return keyword should be the last statement of return type method
	public int subtraction() {
		int total = a - b;
		System.out.println("Subtraction of a and b is: " + total);
		return total;
	}
	
	// return type method which is returning String data type
	public String fullName() {
		String myName = firstName + " " + lastName;
		System.out.println("My name: " + myName);
		return null;
	}
	
	public byte myAge() {
		return 0;
	}
	
	// You should memorize below info
	
	// default value of byte is 0
	// default value of short is 0
	// default value of int is 0
	// default value of long is 0
	
	// default value of float is 0.0
	// default value of double is 0.0
	
	// default value of char [eclipse cannot recognize it, but that is a uni code value]
	// default value of boolean is false
	
	// default value of String is null
	
		
	
	
	

}
