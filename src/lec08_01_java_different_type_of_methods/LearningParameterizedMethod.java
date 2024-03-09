package lec08_01_java_different_type_of_methods;

public class LearningParameterizedMethod {
	// Global variable or class variable
	public int a;
	public int b;
	
	// void type parameterized method
	// Advantage of parameterized methods is, it can be reused
	public void addition (int a, int b) { // a and b is the parameter here
		// Inside method, we don't need a relation between variable and parameter like Constructor
		int sum = a + b;
		System.out.println("Addition of a and b is: " + sum);		
	}
	
	// return type parameterized method
	// if a method is parameterized, then no need of variables as 'c' and 'd'
	public int multiplication (int c, int d) {
		int multi = c*d;
		System.out.println("Multiplication outcome is: " + multi);
		return c*d; // we can also write like this
	}
	
	// parameterized method can be void type or return type
	
	public String myName (String fn, String ln) {
		String name = fn + " " + ln;
		System.out.println("My Name: " + name); 
		return fn + " " + ln; // we can also write like this
	}
	
	// static type method
	// static is a local member method of this class
	// other class can't call it
	public static void country() {
		System.out.println("USA");
	}
	
	// final type method
	// when there is a final keyword, you can't change the method
	public final void city() {
		System.out.println("New York");
	}
	
	
	
	
	
	
	

}
