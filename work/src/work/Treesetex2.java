package work;

import java.util.Comparator;
import java.util.*;

public class Treesetex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet(new MyComparator());
	     t.add("Raja");
	     t.add("Shoba Rani");
	     t.add("Raj Kumari");
	     t.add("Ganga bhavani");
	     t.add("Ramulamma");
	     
	     System.out.println(t);
	}
}
class MyComparator implements Comparator{
	
	public int compare(Object obj1,Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		return -s1.compareTo(s2);
		
}
	
}
