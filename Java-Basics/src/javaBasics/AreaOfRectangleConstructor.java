package javaBasics;

public class AreaOfRectangleConstructor {
	
	double area;
	
	AreaOfRectangleConstructor(double l,double b)
	{
		area=l*b;
	}
	
	void display()
	{
		System.out.println("Area of the rectangle is: "+area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfRectangleConstructor rt=new AreaOfRectangleConstructor(10.23,20.32);
		rt.display();
		

	}

}
