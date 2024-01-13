package lec06_02_java_constructor;

public class Employee {
	// variables declared
	// Class variable or Global variable 
	public String empName;
	public int empId;
	public char empGender;
	public boolean fullTimeEmployee;
	
	// Constructor are 2 types --
	// default constructor (no argument constructor) and parameterized constructor
	// A class can contain one default constructor and one or (more than one) parameterized constructor
	// Default Constructor must be declared before parameterized constructor.
	// You shouldn't write a parameterized constructor without writing a default constructor. It's a norm.
		
	// default Constructor is declared/defined
	public Employee () {
		System.out.println("I am a Constructor from Employee Class");
	}

	// here empName is called parameter, in line 6, that is variable, same for others
	// 'this' keyword represents an instance of the class. 
	// 'this' keyword can be used to access class methods and variables.
	public Employee(String empName, int empId, char empGender, boolean fullTimeEmployee) {
		this.empName = empName;
		this.empId = empId;
		this.empGender = empGender;
		this.fullTimeEmployee = fullTimeEmployee;
		System.out.println("Employee Name: " + empName  + "\nEmployee Id: " + empId + "\nEmployee Gender" + empGender + "\nFull Time Employee: " + fullTimeEmployee);
	}
	
	
	
	
	
	

}
