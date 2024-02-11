package lec10_java_conditional_statements;

import java.util.Scanner;

/*
Java Logical Operators: 
Logical operators are used to determine the logic between variables or values. example below:

&&	 Logical and operator (Returns true if both statements are true, x < 5 &&  y < 10)
If both condition is true, the condition body will be executed
If both condition is false, the condition body will not be executed
If one condition is true and one false, the condition body will not be executed

|| 		Logical or operator (Returns true if one of the statements is true, x < 5 || y < 4)
If both condition is true, the condition body will be executed
If both condition is false, the condition body will not be executed
If one condition is true and one false, the condition body will be executed

!     Logical not operator [Reverse the result, returns false if the result inside is true, (!(x < 5 && y < 10))] 

 */

public class WhenTwoConditionPresent {

	public static void main(String[] args) {
		System.out.println("---: Please Put the values in the console :---");
		Scanner scanner = new Scanner(System.in);
		int val1 = scanner.nextInt();
		int val2 = scanner.nextInt();
		
		if (val1%2==0 && val1>val2) {
			System.out.println(val1 + " is an even number and " + val1 + " is greater than " + val2);
		}
		
		
		
		
		
		
		
		scanner.close();
	}

}
