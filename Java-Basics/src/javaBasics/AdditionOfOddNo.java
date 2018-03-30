package javaBasics;

public class AdditionOfOddNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0,i;
		
		for(i=0;i<=20;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
		}
		
		System.out.println("Addition of odd numbers is : "+sum);

	}

}
