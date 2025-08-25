package com.student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student S1 = new Student("Rohan", "CSEAI", 67, 20);
		System.out.println("The namme of the student is " + S1.Name);
		RegularStudent rs = new RegularStudent("Riya", "AI", 90, 19, 90, "H703");
		rs.displayInfo();
		rs.payfee();
		S1.payfee();
		HostelStudent hs = new HostelStudent("Priya", "AI", 90, 19, 90, "H703", "Arya", 309);
		hs.payfee();
	}
}