package lec08_01_java_different_type_of_methods;

public class LearningReturnTypeMethodWhereMethodInsideMethod {
	// Global variable or class variable
	public int a = 43;
	public int b = 21;
	
	protected String firstName = "Alex";
	String lastName = "Fergunson"; // Here access modifier is 'default'
	
	// return type method which is returning int data type
	// return keyword should be the last statement of return type method
	public int subtraction() {
		int total = a - b;
		System.out.println("Subtraction of a and b is: " + total);
		fullName(); // we can call a method inside another method
		return total;
	}
	
	// return type method which is returning String data type
	public String fullName() {
		String myName = firstName + " " + lastName;
		System.out.println("My name: " + myName);
		return null;
	}
	
}
