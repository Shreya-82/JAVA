package com.student;

public class RegularStudent extends Student{
	int attendance_per;
	String class_room;
	public RegularStudent(String Name, String D, int Roll_No, int Age, int attendance_per, String class_room) {
		super(Name, D, Roll_No, Age); //calls student class connstructor
		this.attendance_per = attendance_per;
		this.class_room = class_room;
	}
	
	public RegularStudent() {
		
	}
	
	public void payfee() { //overidding can only be done in different class
		System.out.println("The student " + getName() + " paid the tution fee + Library fee + Lab fee");
	}
}
