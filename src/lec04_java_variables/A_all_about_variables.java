package lec04_java_variables;

public class A_all_about_variables {
	// In the class body, we have to write variable first, Then Constructor and finally Method
	// And they should be before main method
	// variable is also called field [memorize it]
	// Syntax of the variable ended with ;
	
	// all the variables name start with lower case
	// Variable follow Camel Case feature and snake case pattern
	// The most common variables type used are String, int, char and boolean -- always used
	
	// Here variable is declared, how? We didn't give a value for the variable Name	
	public String schoolName; // variable declared, Camel case feature used in the variable name
	public String school_name; // variable declared, Snake case pattern used in the variable name
	
	// public, private, protected, default --> They are called "access modifier" (they represent accessibility), 
	// String = type of the variable, suffix or firstName is the name of the String type variable
	// String type variable is initialized inside double quotation as "Alex"
	// variable initialized below
	public String suffix = "Sir"; // public type access modifier 
	private String firstName = "Alex"; // private type access modifier
	protected String middleName = "B"; // protected type access modifier
	String lastName = "Fergunson"; // default type access modifier, when public, private or protected are absent
	
	// "int" (We say it --> integer) is the type of the variable, "myYearlySalary" is the name of the int type variable
	// int type variable is initialized without any quotation
	public int myYearlySalary = 6468634; // variable initialized
	public int my_yearly_salary; // variable declared
	
	// "char" (character) is the type of the variable, "myGender" is the name of the char type variable
	// char type variable is initialized inside single quotation, 
	// and represented by upper case single letter, No number
	public char myGender = 'M';
	
	// "boolean" is the type of the variable, "usCitizen" is the name of the boolean type variable
	// boolean type variable is initialized without any quotation, only represented by true or false (always in lower case)
	public boolean usCitizen = true;
	
	

}
