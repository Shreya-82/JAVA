package exception.example;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		try {
			int a = 3;
			int b = 0;
			int c = a/b;
		}catch(NullPointerException e) { //we can add multiple catch scenarios with one condition
			System.out.println("Exception is handled");
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception is handled");
		}
		System.out.println("The result is printed");
	}

}
