package com.usa.service;

public class Orders {
	int a;
	
	public static void main(String[] args) {
		System.out.println("My name is Oni");
		//Calling static method with classs name
		Orders.customerRefunds();
		//how to call non static method
		Orders obj = new Orders();
		
		obj.customerRecevied();
		int Number = 100;
		int num = 300;
		System.out.println(num);
		
	}
	
	//Without any public in the front it would be default 
	 public void customerRecevied() {
		 a = 50;
		 System.out.println("Money being transferd");
	System.out.println("Money is transfer from the bank");	 
	double decimal= 10.50;
	int number = 100;
	System.out.println(a);
	 }
	

public static void customerRefunds () {
	System.out.println("I live in Bronx");
	System.out.println("my phone number is 723645678");
	int number = 100;

	
}



}
