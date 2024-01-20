package lec07_02_java_different_type_of_methods;

public class LarningReturnTypeMethod {
	// Global variable or class variable
	public int a = 43;
	public int b = 21;
	
	// void type method
	public void addition01 () {
		int total1 = a + b;
		System.out.println(total1);
	}
	
	// return type method
	public int addition02() {
		int total2 = a + b;
		System.out.println(total2);
		return total2;
	}
	
	public static void main(String[] args) {
		LarningReturnTypeMethod lr = new LarningReturnTypeMethod();
		lr.addition01();
		lr.addition02();
	}
		
	

}
