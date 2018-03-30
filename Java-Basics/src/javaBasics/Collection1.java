package javaBasics;
import java.util.*;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		  list.add("Ravi");//Adding object in arraylist  
		  list.add("Vijay");  
		  list.add("Ravi");  
		  list.add("Ajay");  
		  //Traversing list through Iterator  
		  System.out.println(list);
		  /*Iterator itr=list.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  

	}*/

}
}
