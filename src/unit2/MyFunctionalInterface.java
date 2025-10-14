package unit2;

@FunctionalInterface
interface example{
	void show();
}

//class Demo implements example{
//	public void show() {
//		System.out.println("This is the functional interface");
//	}
//}

public class MyFunctionalInterface {

	public static void main(String[] args) {
//		Demo obj = new Demo();
//		obj.show();
		
//		example obj = new example() {
//			public void show() {
//				System.out.println("This is the functional interface through inner class");
//			}
//		};
		
		example obj = () -> System.out.println("This is the functional interface through inner class");
		obj.show();
	}
}
