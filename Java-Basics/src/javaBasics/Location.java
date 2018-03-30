package javaBasics;
import java.util.*;
//import java.util.Scanner;

public class Location {
	String locationName,city,country;
	Location(String locationName,String city)
	{
		this.locationName=locationName;
		this.city=city;
		this.country="India";
	}
	
	Location(String locationName,String city,String Country)
	{
		this.locationName=locationName;
		this.city=city;
		this.country=Country;
	}
	public void display()
	{
		System.out.println("Branch details are : "+this.locationName+"-"+this.city+"-"+this.country);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String locationName,city,country,ch;
		System.out.println("Enter Location Name");
		locationName=sc.next();
		System.out.println("Enter City");
		city=sc.next();
		System.out.println("Is the branch from the same country");
		ch=sc.next();
		
		
	if(ch.matches("Y"))
	{
		Location l1=new Location(locationName,city);
		l1.display();
	}
	else
	{   System.out.println("Enter Country");
	    country=sc.next();
	    sc.close();
		Location l2=new Location(locationName,city,country);
		l2.display();
	}
		
		

	}

}
