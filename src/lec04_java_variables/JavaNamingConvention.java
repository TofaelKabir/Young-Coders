package lec04_java_variables;

import java.security.PublicKey;

// Project names generally starts with UpperCase --> YoungCoders
// Package names are generally starts with lowerCase --> lec01JavaBasic
// Class names starts with UpperCase  --> HelloWorld
// Class names are usually nouns or noun phrases

// Project, package, Class name follow the Camel case feature or Snake case pattern.

// Camel case feature considered from second word (not from the first word)
// There is No spaces between words, and next words start with Upper case always
// Camel case example for a Project --> YoungCoders
// Camel case example for a package --> lec01JavaBasic
// Camel case example for a Class --> HelloWorldKids

// Alternative example of Camel case (Called snake_case pattern).
// Snake case feature considered from second word, (not from the first word)
// when we use snake case feature, we use underscore [shift + hyphen] from second word, there is no more upper case
// Snake case feature is more readable
// Snake case example for a Project --> Young_coders
// Snake case example for a package --> lec02_java_basic
// Snake case example for a Class --> Java_naming_convention

public class JavaNamingConvention {
	// Non-constant (Regular) variable (or field) names starts with lowerCase
	// They follow camelCase or snake_case_feature
	// variable names must be specific and meaningful
	// (variable name) no duplication is accepted inside the same class
	
	// public is an access modifier, int is the type of variable, houseNumber is the name of the variable
	public int houseNumber = 625; // variable initialized
	public String avenue_name; // variable declared
	
	// Constant names are written with all upper case letters with words separated by underscores
	public String PLANET_NAME = "Earth";
	public String MONTH_NAME;
	public int NUMBER_OF_MONTH = 12;
	
	// names like "string1, myarray1, no_1" are not acceptable as variable names
	// because they are are not specific and can cause confusion like the variable below:
	public String string;
	public int int1;
	
	
}
