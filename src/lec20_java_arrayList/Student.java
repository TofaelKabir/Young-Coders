package lec20_java_arrayList;

public class Student {
	// declaring some variables
	public String fName;
	public int age;
	public String lName;

	// default Constructor
	public Student() {
		System.out.println("Default Constructor");
	}

	// parameterized Constructor
	public Student(String fName, int age, String lName) {
		super();
		this.fName = fName;
		this.age = age;
		this.lName = lName;
	}

}
