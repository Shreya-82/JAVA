package com.student;

abstract class Payment {
	abstract void pay(); //abstract method
	public void showMessage() { //concrete method
		System.out.println("The payment is processing.... ");
	}
}

class CreditCardPayment extends Payment {
	public void pay() {
		System.out.println("The payment is done by credit card.");
	}
	public void showMessage() {
		
	}
}

class UpiPayment extends Payment {
	public void pay() {
		System.out.println("The payment is done by UPI.");
	}
}