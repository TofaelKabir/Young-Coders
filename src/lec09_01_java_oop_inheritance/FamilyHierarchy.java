package lec09_01_java_oop_inheritance;

public class FamilyHierarchy {

	public static void main(String[] args) {
		// Aunt extends GrandFather, Father extends GrandFather, Uncle extends GrandFather
		// This is an example of hierarchical inheritance
		System.out.println("\n----------------------------------------------------");
		GrandFather grandFather = new GrandFather();
		grandFather.grandFatherInfo();
		
		System.out.println("\n----------------------------------------------------");
		Aunt aunt = new Aunt();
		aunt.auntInfo();
		aunt.grandFatherInfo();
		
		
		System.out.println("\n----------------------------------------------------");
		Uncle uncle = new Uncle();
		uncle.uncleInfo();
		uncle.grandFatherInfo();
		
		System.out.println("\n----------------------------------------------------");
		Father father = new Father();
		father.fatherInfo();
		father.grandFatherInfo();
		
		// MySelf extends Father
		// This is an example of single inheritance
		System.out.println("\n----------------------------------------------------");
		MySelf mySelf = new MySelf();
		mySelf.myInfo();
		
		System.out.println("\n----------------------------------------------------");
		Sister sister = new Sister();
		sister.sisterInfo();
		sister.fatherInfo();
		sister.grandFatherInfo();
		
		// Niece extends Sister, Sister extends Father, Father extends GrandFather
		// This is an example of multilevel inheritance
		System.out.println("\n----------------------------------------------------");
		Niece niece = new Niece();
		niece.nieceInfo();
		niece.sisterInfo();
		niece.fatherInfo();
		niece.grandFatherInfo();
		

	}

}
