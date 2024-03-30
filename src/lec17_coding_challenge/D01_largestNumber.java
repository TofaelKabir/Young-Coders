package lec17_coding_challenge;

public class D01_largestNumber {

	public static void main(String[] args) {
		int [] number = {2, 12, 10, 1, 50};
		
		int largest = number[0];
		
		for(int i = 0; i< number.length; i++) {
			if(number[i]>largest) {
				largest = number[i];
			}
		}

	}

}
