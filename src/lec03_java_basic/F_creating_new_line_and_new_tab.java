package lec03_java_basic;

// how to delete a specific line?
// put your cursor at the end, or beginning or middle, and then type 'control/command + d'

// some symbol and characters are used "inside the String"
// use of \n --> creating a new line (not next line) ---> a lot of use of \n in IT industry
// use of \t --> creating a tab  ---> a lot of use of \t
// No need to give a space after \n or \t, it will give you a space

// Below 2 is: extra information, not used generally
// use of \b --> creating back space -- not used --- also doesn't work in eclipse (Work in IntelliJ)
// use of  \r --> creating carriage return -- not used -- similar like \n

public class F_creating_new_line_and_new_tab {
	public static void main(String[] args) {
		System.out.println("Jason Momoa, Born at 1979, American actor (Game of Thrones, Aquaman), born in Honolulu, Hawaii");
		System.out.println("\n-----------------------------------------------------------------------------------------");
		System.out.println("\tJason Momoa, \n\tBorn at 1979, American actor (Game of Thrones, Aquaman), born in Honolulu, Hawaii");
	}

}
