package unit2;

@FunctionalInterface
interface Greet{
	void greeting();
}

public class MethodReferenceExample {
	static void static_greet() {
		System.out.println("this is static method reference");
	}
	
	void instance_greet() {
		System.out.println("this is instance method reference");
	}
	
	public static void main(String[] args) {
		MethodReferenceExample obj1 = new MethodReferenceExample();
		Greet obj = MethodReferenceExample::new;
//		w
//		Greet obj = MethodReferenceExample::static_greet;
		obj.greeting();
	}

}
