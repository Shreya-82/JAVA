package exception.example;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo1 {
	public void divide() {
		int a = 7;
		int b = 0;
		int c =  a/b;	
	}

	public static void main(String[] args) {
		ExceptionDemo1 ed = new ExceptionDemo1();
		try {
			ed.divide();
		}catch(ArithmeticException e) {
			System.out.println("Exception Handled");
		}
		try {
			FileReader fr = new FileReader("abc.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();                     //exception name,description,stack trace
			System.out.println(e.toString());       //exception name,description
			System.out.println(e.getMessage());    //description
		}
	}

}
