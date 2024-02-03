package lec08_01_java_different_type_of_methods;

public class MyInfo {
	// Class body contains methods after variables and Constructor
	// Those methods can be either implemented or initialized. (very important info)
	// Inside the class, method can't be declared (very important info)
	// What is method implemented? And: The method which have a body [surrounded by curly braces]
	
	// How to create a method?
	// This is a void type method
	// method name generally starts with lower Case
	// and follow camel case feature or snake case pattern
	
	// method implemented -01
	public void newYork() {
		System.out.println("I am the newyork method");
	}
	
	// method implemented -02
	// there can be more than one method inside a class with different name
	public void city_bus() {
		System.out.println("I am the city_bus method");
	}
	
	// method implemented -03
	// method name can be same as class name, but in lower case
	// but, this is not mandatory to make a method name as class name
	public void myInfo() {
		System.out.println("I am the myInfo method");
	}
	
	public static void main(String[] args) {
		MyInfo myInfo = new MyInfo();
		myInfo.newYork(); // method initialized -01
		myInfo.city_bus(); // method initialized -02
		myInfo.myInfo(); // method initialized -03

	}

}
