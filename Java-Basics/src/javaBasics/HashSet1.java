package javaBasics;
import java.util.*;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h=new HashSet();
		h.add("S");
		h.add("C");
		h.add("F");
		h.add(null);
		h.add("C");
		h.remove("S");
		System.out.println(h);

	}

}
