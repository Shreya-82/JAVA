package Example.access.specifiers;

import com.student.*;

public class Test extends Student{ // Test becomes subclass of Student

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student S1 = new Student("Rohan", "CSEAI", 67, 20);
		Test T1 = new Test();
		System.out.println("The namme of the student is " + T1.Name);
	}
}