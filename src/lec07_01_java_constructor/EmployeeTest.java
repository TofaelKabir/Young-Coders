package lec07_01_java_constructor;

public class EmployeeTest {

	public static void main(String[] args) {
		// When class is instantiated, means when object is created, Constructor is Initialized
		// default Constructor Initialized
		Employee employee = new Employee(); 
		System.out.println("------------------------------------------------\n");
		// Parameterized Constructor Initialized -01
		// Here "Alex F" is called 'argument' which is String type
		// Here 21450 is called 'argument' which is int type
		// Here 'M' is called 'argument' which is char type
		// Here false is called 'argument' which is boolean type
		Employee employee2 = new Employee("Alex F", 21450, 'M', false);
		System.out.println("------------------------------------------------\n");
		Employee employee3 = new Employee("Elena M", 32416, 'F', true);
		System.out.println("------------------------------------------------\n");
		Employee employee4 = new Employee("Joe B", 63547, 'M', true);
		// The sequence of argument should be same as parameter inside the parameterized constructor
		// But before we should send same number of parameter
		
		System.out.println("------------------------------------------------\n");
		// Parameterized Constructor Initialized -02
		Employee employee5 = new Employee(636538, 'F', true);
		
		System.out.println("------------------------------------------------\n");
		// Parameterized Constructor Initialized -03
		Employee employee6 = new Employee('F', false, 36542);
		// Argument is put based on parameter, not by syso outcome

	}

}
