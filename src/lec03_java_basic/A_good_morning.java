package lec03_java_basic;

public class A_good_morning {
	public static void main(String[] args) {
		System.out.println("Good Morning! ");
		System.out.print("How are you all? ");
		System.out.print("Do you understand what print() or println() do? ");
		System.out.println("If yes, Great!");
		// although first line is println(), but the next 2 is print() and it will continue printing together
		System.out.println("If No, Please ask me question");
		
		// to print any error -- syserr
		// for you guys, no need
		System.err.println("This is an Error outcome! and it will appeared in red color");
	}

}

// what println() method do? -- Terminates the current line by writing the line separator string.
// println() -- print line by line

// print() -- print continuously, not line by line, connect the next outcome
// you can make it readable by putting a space at the end or at the beginning of next line
