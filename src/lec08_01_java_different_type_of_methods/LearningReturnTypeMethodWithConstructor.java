package lec08_01_java_different_type_of_methods;

public class LearningReturnTypeMethodWithConstructor {
	// Global variable or class variable
	public int a = 43;
	public int b = 21;
	
	protected String firstName = "Alex";
	String lastName = "Fergunson"; // Here access modifier is 'default'
	
	public LearningReturnTypeMethodWithConstructor () {
		addition();
		subtraction();
		fullName();
		// We can can call methods inside Constructor too.
		// Why we put methods inside constructor?
		// if a class is instantiated [when object is created], constructor is initialized, 
		// so if we put something need us during instantiation, then it helps
		System.out.println("I am coming from Constructor body\n");
	}
	
	// void type method
	public void addition () {
		int sum = a + b;
		System.out.println("Addition of a and b is: " + sum);
	}
	
	// return type method which is returning int data type
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
