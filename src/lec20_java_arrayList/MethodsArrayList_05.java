package lec20_java_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MethodsArrayList_05 {
	// not important, Use of Scanner class
		public static void main(String[] args) {
			ArrayList<Integer> ar = new ArrayList<Integer>();
			System.out.println("Please enter int type number");
			Scanner sc = new Scanner(System.in);
			int limit = 5;
			for (int i = 0; i < limit; i++) {
				ar.add(sc.nextInt());
			}
			sc.close();
			System.out.println("Here is your result: " + ar);

		}

}
