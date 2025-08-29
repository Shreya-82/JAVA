package com.student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student S1 = new Student("Rohan", "CSEAI", 67, 20);
		System.out.println(S1.search(27));
		System.out.println(S1.search("Rohan", "CSEAI"));
		System.out.println("The namme of the student is " + S1.getName());
		RegularStudent rs = new RegularStudent("Riya", "AI", 90, 19, 90, "H703");
//		S1.Name = "Roshni"; //not having direct access as name is private
		S1.SetName("Shreya");
		rs.displayInfo();
		rs.payfee();
		S1.payfee();
		HostelStudent hs = new HostelStudent("Priya", "AI", 90, 19, 90, "H703", "Arya", 309);
		hs.payfee();
	}
}