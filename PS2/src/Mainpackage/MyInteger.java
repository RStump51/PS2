package Mainpackage;


public class MyInteger {
	//Establishing int value
	private int value;
	public char[] chars = { '7', '6', '5', '4', '3'};
	
	//naming string for parsing
	String string = "java";
	//method for parsing the array into an integer 
	public static int parseInt(char[] chars) {

		return parseInt(chars);

	}
	//method for parsing the string into an integer
	public static int parseInt(String string) {

		return parseInt(string);
	}
	//MyInteger constructor
	public MyInteger(int value) {
		this.value = value;

	}
	//get method for value
	public int getValue() {
		return value;

	}
	//returns true if value is odd by using modulus 
	public boolean isOdd() {

		if (this.getValue() % 2 != 0) {
			return true;
		} else
			;
		{
			return false;

		}
	}
	//returns true if value is even using modulus 
	public boolean isEven() {

		if (this.getValue() % 2 == 0) {
			return true;
		} else
			;
		{
			return false;
		}
	}
	//returns true if value is prime with a for loop that checks if value has any whole number divisions
	public boolean isPrime() {
		for (int divide = 2; divide < value; divide++) {
			if (value % divide == 0) {
				return false;

			}
		}
		return true;
	}
	//static method for checking if the value is even 
	public static boolean isEven(int value) {
		if (value % 2 != 0) {
			return false;
		} else {
			return true;
		}
	}
	//static method for checking if the value is odd
	public static boolean isOdd(int value) {
		if (value % 2 == 0) {
			return false;
		} else
			
		{
		}
		return true;
	}
	//static method for checking if the value is prime
	public static boolean isPrime(int value) {
		for (int divide = 2; divide <= value / 2; divide++) {
			if (value % divide != 0) {
				return true;

			}
		}
		return false;
	}
	//static method for checking if the value is even using MyInteger as the parameter
	public static boolean isEven(MyInteger value) {
		if (value.getValue() % 2 != 0) {
			return false;
		} else {
			return true;
		}
	}
	//static method for checking if the value is odd using MyInteger as the parameter
	public static boolean isOdd(MyInteger value) {
		if (value.getValue() % 2 != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//static method for checking if the value is prime using MyInteger as the parameter
	public static boolean isPrime(MyInteger value) {
		for (int divide = 2; divide <= value.getValue() / 2; divide++) {
			if (value.getValue() % divide != 0) {
					return true;

				}
			}
			return false;
			
			
		
		
	}
	//checks if value is equal to another specified value and returns true if so
	boolean equals(int number) {
		if (value == number) {
			return true;
		} else {
			return false;
		}
	}
	//returns true if the value from MyInteger class is the same as "number'
	boolean equals(MyInteger number) {
		return this.value == number.getValue();

		}
	}




