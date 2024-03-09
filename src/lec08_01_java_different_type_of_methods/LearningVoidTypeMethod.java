package lec08_01_java_different_type_of_methods;

public class LearningVoidTypeMethod {
	// Global variable or class variable
	public int a = 43;
	public int b = 21;
	
	// void type method
	// This method never say what type of parameterized outcome we are getting
	public void addition () {
		int sum = a + b; // called local variable, because belongs to the method only
		System.out.println("Addition of a and b is: " + sum);
	}

}
