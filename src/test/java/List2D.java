import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List2D 
{
	public static void main(String[] args) {
		List<LinkedList<String>> li = new ArrayList<LinkedList<String>>();
		//1st Row
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("suresh");
		list.add("suresh@gmail");
		list.add("pollachi");
	    
		//2nd Row 
		LinkedList<String> list2 = new LinkedList<String>();
		list2.add("agila");
		list2.add("agila@gamil");
		list2.add("hosur");
		

		
		
		li.add(list);
		li.add(list2);
		
		LinkedList<String> linkedList = li.get(1);
		System.out.println(linkedList);
		String string = linkedList.get(1);
		System.out.println(string);
		
 
	
	   

	 
	   
		
		
 		
	}

}
