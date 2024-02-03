package lec09_01_java_oop_inheritance;

// Here Aunt is a child class and GrandFather is a parent class
// We use "extends" keyword to inherit the parent class
// "extends" keyword can't inherit more than one parent class
// the keyword is "extends", not "extend"

public class Aunt extends GrandFather{
	public void auntInfo() {
		System.out.println("Aunt: Jamila, Grandfather: Ismail");
	}

}
