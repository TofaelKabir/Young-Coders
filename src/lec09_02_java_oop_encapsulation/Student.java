package lec09_02_java_oop_encapsulation;

public class Student {
	// we do encapsulation by making variables or method private
	// But how to access them in another class? -- By getters and setters method
	private String stName;
	private int stId;
	private char stGender;
	private boolean fullTimeSt;
	private float stGrade;
	
	/*
	select variable -- right click -- source -- Generate Getters and Setters 
	-- select variables -- insertion point: after the last variable present inside the class 
	--- sorts by: Fields in getter/setter pair 

   other way:
   from the header -- source --  follow above 
	 */
	
	// This pair is called getters and setters method
	
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getStId() {
		return stId;
	}
	public void setStId(int stId) {
		this.stId = stId;
	}
	public char getStGender() {
		return stGender;
	}
	public void setStGender(char stGender) {
		this.stGender = stGender;
	}
	public boolean isFullTimeSt() {
		return fullTimeSt;
	}
	public void setFullTimeSt(boolean fullTimeSt) {
		this.fullTimeSt = fullTimeSt;
	}
	public float getStGrade() {
		return stGrade;
	}
	public void setStGrade(float stGrade) {
		this.stGrade = stGrade;
	}
	
	
	
}
