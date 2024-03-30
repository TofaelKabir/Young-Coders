package lec17_coding_challenge;

import java.awt.print.Printable;
import java.util.Arrays;

public class Intro {

	public static void main(String[] args) {
		// Below 3 is Array
		String [] allPresident = {"Biden", "Trump", "Obama", "Bush Jr", "Clinton", "Bush Sr"};  
		int [] age = {12, 18, 16, 15, 13};
		char [] sex = {'M', 'M', 'M', 'F', 'M'};
		System.out.println(sex[3]);
		System.out.println(sex.length);
		
		System.out.println("------------------------------------------------------------------------");
		// This is String
		String s = "Lorem ipsum dolor sit amet consectetur adipisici pariatur nulla?";
		System.out.println(s);
		System.out.println("The length of the String is: " + s.length());
		// Running a for loop to iterate through the String
		for(int i =0; i<s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		System.out.println("------------------------------------------------------------------------");
		String str1 = "Mr owl ate my metal worm";
    	String [] wordByWord = str1.split(" ");// There should be an space in String
    	System.out.println(Arrays.toString(wordByWord));
		
		System.out.println("------------------------------------------------------------------------");
    	String str2 = "Mr owl ate my metal worm";	
    	char [] characterByCharacter = str2.toCharArray();
    	System.out.println(Arrays.toString(characterByCharacter));
    	
    	System.out.println("------------------------------------------------------------------------");
    	// print() vs println()
    	
    	

	}

}
