package Test1;

import java.util.*;

public class ArrayListTraversingUsingforEach_forEachRemaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");

		System.out.println("Traversing list through forEach() method:");  
		//The forEach() method is a new feature, introduced in Java 8.  
		list.forEach(a->{ //Here, we are using lambda expression  
			System.out.println(a);  
		});  

		System.out.println("Traversing list through forEachRemaining() method:");  
		Iterator<String> itr=list.iterator();  
		itr.forEachRemaining(a-> //Here, we are using lambda expression  
		{  
			System.out.println(a);  
		});  

	}

}
