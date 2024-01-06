package lec05_01_java_variables;

public class MyInfoTest {

	public static void main(String[] args) {
		// You have to create an object generally inside the main method, If you create outside, you can use object outside the main method
		// MyInfo (blue color) is a class, myInfo (yellow color) is an object, also called reference type variable
		// object name always start with lower case, follow camel case or snake case feature
		// = equal operator, new is a keyword of Java
		
		// What happened below? Try to Understand, if don't understand, no problem
		// an object is created (myInfo) (by you) from 'MyInfo' class (following blueprint) which (object) is new and MyInfo type
		// This action (line 23) --> (when an object is created from a class) is called instantiation, (vvImp info)
		// Then we say the class (MyInfo) is instantiated or Class Instantiated

		// here myInfo is the object [yellow color]
		// How the variables are printing from here where variables are absent in this class?
		// Ans: Inside same package, public, protected and default type content can be accessible [this info will come later]
		// Ans: Inside different package, only public type content can be accessible [this info will come later]
		
		// When an object [myInfo] is created from a class [MyInfo], Constructor is initialized
		// When an object is created from a class, the class is instantiated
		MyInfo myInfo = new MyInfo(); // Constructor Initialized -- when an object is created
		System.out.println("My Name: " + myInfo.myName);
		System.out.println("My Age: " + myInfo.myAge);
		System.out.println("My Name: " + myInfo.myName + "\nMy Age: " + myInfo.myAge);
		System.out.println("Hello World!");
		
		// Method initialized
		myInfo.taxiService();
		myInfo.uber_service();
		myInfo.myInfo();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
