package javaBasics;
import java.util.*; 

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayList AL=new ArrayList();
	AL.add("Uday");
	AL.add("Swara");
	AL.add("null");
	AL.add("Shubhangi");	
	System.out.println(AL);
	AL.add(2,"Gauri");
	System.out.println(AL);
	AL.remove(1);
	System.out.println(AL);
	Collections.sort(AL);
	System.out.println(AL);
	Iterator itr=AL.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  

       }
	  int size=AL.size();
	  System.out.println("Size of an array is"+size);
	
	

	}

}
