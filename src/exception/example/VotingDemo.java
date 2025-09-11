package exception.example;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String msg) {
		super(msg);
	}
}

class Voting {
	public void checkEligibility(int age) throws InvalidAgeException {
		if(age < 18) {
			throw new InvalidAgeException("You are not eligible to vote.");
		}else {
			System.out.println("You are eligible to vote.");
		}
	}
}

public class VotingDemo {

	public static void main(String[] args) throws InvalidAgeException {
		Voting v = new Voting();
		 try {
			 v.checkEligibility(26);  // example age
	     }catch (InvalidAgeException e) {
	    	 System.out.println(e.getMessage());
	     }
		 finally {
			 System.out.println("2025");
		 }
	}

}
