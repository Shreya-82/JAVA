package com.student;

public class HostelStudent extends RegularStudent{
	String hostel_name;
	int room_no;
	
	public HostelStudent(String Name, String D, int Roll_No, int Age, int attendance_per, String class_room, String hostel_name, int room_no) {
		super(Name, D, Roll_No, Age, attendance_per, class_room);
		this.hostel_name = hostel_name;
		this.room_no = room_no;
		
	}
	public void payfee() { //overidding can only be done in different class
		System.out.println("The student " + getName() + " paid the tution fee + Library fee + Lab fee + Hostel fee");
	}
}
