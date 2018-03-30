package javaBasics;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c=0;
		Scanner value = new Scanner(System.in);
		System.out.println("Enter value of a");
		
		a=value.nextDouble();
		//System.out.println(a);
		System.out.println("Enter value of b");
		b=value.nextDouble();
	
		
		char operator;
		System.out.println("Enter the operation to be performed +,-,/,*");
		
		operator=value.next().charAt(0);
		//operator=value.next();
		value.close();
        
		
		switch(operator)
		{
		case '+':
			c=a+b;
			break;
		case '-':
			c=a-b;
			break;
		case '*':
			c=a*b;
			break;
		case '/':
			c=a/b;
			break;
		default:
			System.out.println("You have entered invalid operator");
			
			
		
		}
		
		
		System.out.println(a+" "+operator+" "+b+":"+c);
		

	}

}
