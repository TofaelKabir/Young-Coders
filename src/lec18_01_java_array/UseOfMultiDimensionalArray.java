package lec18_01_java_array;

import java.util.Arrays;

public class UseOfMultiDimensionalArray {

	public static void main(String[] args) {
		String[] ax = new String[] {"First", "Second", "Third", "Fourth", "Fifth"};
		// Literal representation of an String type Array, line 11 is the best  representation of an Array

		String[] ay = {"First", "Second", "Third", "Fourth", "Fifth"};
		System.out.println("The list of the array's [ay] elements: " + Arrays.toString(ay));
		
		// How to compare two Array? here a and c.
		System.out.println("Is Array ax and ay is equal? Ans: " + Arrays.equals(ax, ay));
		
		// New 22-29, how to write a multidimensional Array
		// Need to know about Multi Dimensional Array
		String [] arr1 = new String[] { "hundred", "hundred One" };
		String [] arr2 = new String[] { "two hundred", "thirty four" };
		// common name:  multi dimensional array [hard topic]
		// An array of array's, containing String objects //double dimension or two dimensional or multi dimensional -- important
		// Also interview Question
		
		// Line 26 is the take out from this page		
		String [][] multiDimensionalArray = new String [][] {arr1, arr2};
		// Compare the different outputs
		// Print the array using Arrays.toString()
		System.out.println(Arrays.toString(multiDimensionalArray)); // providing Array ID, so not giving value
		
		// method is Not important
		// Print the array using Arrays.deepToString() - "RECOMMENDED for multi-dimensional array"
		System.out.println(Arrays.deepToString(multiDimensionalArray));
		
		
		System.out.println("\n----------------------------------------------");
		// Use f ASCII Table
		char[] a = new char[6]; // Different data type (String, char, int etc) can't be mix in an Array
		a[0] = 'A';
		a[1] = 106; // If ASCII table have value which represent character then, it will print j
		a[2] = 'c';
		a[5] = '8'; // included as character, but not a good practice
		// Always use upper case single letter
		
		System.out.println("Single index value: " + a[1]);// output:
		System.out.println("Single index value: " + a[5]);// output:
		
		// we can use Scanner class or random class to create an Array

	}

}
