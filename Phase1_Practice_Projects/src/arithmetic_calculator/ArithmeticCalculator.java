package arithmetic_calculator;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		double a,b;
		double result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Number:");
		a = sc.nextDouble();
		System.out.println("Enter The Second Number");
		b = sc.nextDouble();
		
		System.out.println("Enter The Operation");
		char operation = sc.next().charAt(0);
		
		switch(operation) {
		
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			result = a / b;
			break;
	    default :
	    	System.out.println("Invalid Operation");
		}
		System.out.println("The Result is: "+ result);
	}

}
