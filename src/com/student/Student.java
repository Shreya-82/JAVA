package com.student;

public class Student {
//	protected String Name;
//	protected String Department;
////	final  String Department = "AI";
//	int Roll_No;
//	public int Age;
//	static String CollegeName = "KIET";
	
	protected String Name;
	String Department;
//	final  String Department = "AI";
	int Roll_No;
	int Age;
	static String CollegeName = "KIET";
	//Constructor
	public Student(String Name, String D, int Roll_No, int Age) {
		this.Name = Name;
		this.Department = D;
		this.Roll_No = Roll_No;
		this.Age = Age;
		
	}
	
	//Default Constructor
	public Student() {
		this.Name = null;
		this.Department = null;
		this.Roll_No = 0;
		this.Age = 0;
		
	}
	
	//Copy Constructor
	public Student(Student  Student) {
		this.Name  =  Student.Name;
		
	}
	
	public void studying(int numberOfHours) {
		System.out.println("The student" +  Name + " is studying for" + numberOfHours);
	}
	public void readAndwrite() {
		System.out.println("The student can read and write");
	}
	public void displayInfo() {
		System.out.println("The student name is " + Name + " and age is " + Age + ", roll no is " + Roll_No + ", department is " + Department);
	}
	public void payfee() {
		System.out.println("The student " + Name + " paid the tution fee");
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Student std1 = new Student(); // by default constructor
//		Student std2 = new Student("Rohan","AI",1,19); 
////		std1.studying(5);
//		std1.displayInfo();
//		std2.displayInfo();
////		std1.Name = "Shreya";
////		std1.Roll_No = 1;
////		std1.Age = 18;
////		std1.Department = "CSEAI";
////		std1.displayInfo();
//		
////		System.out.println("College name is " + Student.CollegeName);
////		System.out.println("College name is " + std1.CollegeName);
////		Student.CollegeName = "ABES";
////		System.out.println("College name is " + std2.CollegeName);
////		std1.CollegeName = "IIT";
////		System.out.println("College name is " + std1.CollegeName);
////		System.out.println("College name is " + std2.CollegeName);
//		
////		std1.Department = "AIML"; //error(final department)
//	}
}