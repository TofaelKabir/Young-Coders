package lec08_01_java_different_type_of_methods;

public class TestMethod {

	public static void main(String[] args) {
		LearningVoidTypeMethod lv = new LearningVoidTypeMethod();
		lv.addition();
		
		System.out.println("\n-----------------------------------------------------");
		LearningReturnTypeMethod lr = new LearningReturnTypeMethod();
		lr.subtraction();
		lr.fullName();
		
		System.out.println("\n-----------------------------------------------------");
		LearningReturnTypeMethodWhereMethodInsideMethod lrm = new LearningReturnTypeMethodWhereMethodInsideMethod();
		lrm.subtraction();
		
		System.out.println("\n-----------------------------------------------------");
		LearningReturnTypeMethodWithConstructor lrc = new LearningReturnTypeMethodWithConstructor();
		
		System.out.println("\n-----------------------------------------------------");
		LearningParameterizedMethod lp = new LearningParameterizedMethod();
		lp.addition(43, 21); // 43 and 21 is argument, and it is not coming from variable
		lp.addition(31, 10); // 31 and 10 is the argument
		lp.multiplication(4, 13);
		lp.multiplication(9, 5);
		lp.myName("Azran", "Azim");
		lp.myName("Joe", "Biden");
		// static method can be called by the class directly, object shows warning
		LearningParameterizedMethod.country();
		lp.city();
		
		
		
		
		

	}

}
