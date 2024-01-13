package lec06_01_java_variables_declared_final;

public class MyInfoTest {

	public static void main(String[] args) {
		MyInfo tofael = new MyInfo(); // Constructor initialized
		tofael.myName = "Tofael"; // variable initialized
		tofael.myAge = 77;
		tofael.myApartmentRent = 23000;
		tofael.myYearlySalary = 100000;
		tofael.myBankBalance = 4676276574684l;
		tofael.myHeight = 1.65f;
		tofael.myGrade = 3.74653;
		tofael.myGender = 'M';
		tofael.usCitizen = true;
		tofael.myInfo(); // method initialized
		
		System.out.println("\n------------------------------------\n");
		MyInfo nabeeha = new MyInfo();
		nabeeha.myName = "Nabeeha T";
		nabeeha.myAge = 55;
		nabeeha.myApartmentRent = 20000;
		nabeeha.myYearlySalary = 486536434;
		nabeeha.myBankBalance = 6356623876642l;
		nabeeha.myHeight = 1.4567f;
		nabeeha.myGrade = 3.999328;
		nabeeha.myGender = 'F';
		nabeeha.usCitizen = true;
		nabeeha.myInfo();
		
		System.out.println("\n------------------------------------\n");
		MyInfo raiyan = new MyInfo();
		raiyan.myName = "Raiyan Saaim";
		raiyan.myAge = 75;
		raiyan.myApartmentRent = 25000;
		raiyan.myYearlySalary = 786536434;
		raiyan.myBankBalance = 9956623876642l;
		raiyan.myHeight = 1.7067f;
		raiyan.myGrade = 4.00000;
		raiyan.myGender = 'M';
		raiyan.usCitizen = true;
		raiyan.myInfo();
		
		// The advantage of declaring variables are --- 
		// we can initialize the variables as many times as we want by creating new object
		
		
		
		
		
		
		

	}

}
