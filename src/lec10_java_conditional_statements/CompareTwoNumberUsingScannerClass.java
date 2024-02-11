package lec10_java_conditional_statements;

import java.util.Scanner;

public class CompareTwoNumberUsingScannerClass {

	public static void main(String[] args) {
		// Line 9-12 is new here
		System.out.println("---: Please Put the values in the console :---");
		// Scanner class allow you to type in the console
		Scanner scanner = new Scanner(System.in);
		int val1 = scanner.nextInt();
		int val2 = scanner.nextInt();
		
		// != represent 'logical not'
		if(val1!=val2) {
			System.out.println(val1 + " is not equql to " + val2);
		}  else if (val1==val2) {
			System.out.println(val1 + " is equal to " + val2);
		} else {
			System.out.println("Please provide a correct number");
		}
		scanner.close();
	}

}
