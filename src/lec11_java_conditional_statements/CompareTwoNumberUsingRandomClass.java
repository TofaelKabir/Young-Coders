package lec11_java_conditional_statements;

import java.util.Random;

/*
Even number (2, 4, 6, 8, 10, ......): A number divided by 2 with a remainder/modulus of 0.
Example 56 : 56/2 --- divisor 2, quotient 28, remainder/modulus 0

Odd number (1, 3, 5, 7, 9, .......) : A number divided by 2 with a remainder of 1.
Example 37 : 37/2 --- divisor 2, quotient 18, remainder/modulus 1

Is 0 an Even Number? The answer is easy: Yes, zero is an even number. 
Usually, zero together with the even numbers, 
so certainly it is not an odd number. An even number is formally defined as an integer of the form n = 2x, 
where x is an integer.
an odd or even number can also be negative

Logically
val1 % 2 == 1   "represent odd number"
val1 % 2 == 0   "represent even number"

 */

public class CompareTwoNumberUsingRandomClass {

	public static void main(String[] args) {
		// Line 9-12 is new here
		// Random class choose number randomly
		Random random = new Random();
		int val1 = random.nextInt(1000); // we can put a range of 1000 inside parentheses
		// choosing  a range is not mandatory, then it will randomly choose any number from int range
		// range/bound can't be negative
		
		// new here, how to write odd and even number
		// here is 2 is the divisor and 0 or 1 is the remainder or Modulus (%)
		// and it is not mandatory to use Scanner or Random class
		if(val1 % 2 == 0) {
			System.out.println(val1 + " is an even number");
		} else if (val1 % 2 ==1) {
			System.out.println(val1 + " is an odd number");
		}
		
		
	}

}
