package lmsprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Arraylistdemo {

	public static void main(String[] args) {
		List listOfObjects=new ArrayList();
		List<Integer> ranklist=new ArrayList();
		Vector<String> departmentList=new Vector();
		 departmentList.addElement("Operations");
		//add ranks to rank list
		ranklist.add(43);
		ranklist.add(5);
		ranklist.add(77);
		ranklist.add(3);
		//add departments
		departmentList.addElement("Operations");
		departmentList.addElement("Sales");
		//display rank list
		for(Integer rank:ranklist){
			System.out.println(rank);
		}
		
		//show the rank list in sorting order
		Collections.sort(ranklist);
		System.out.println("After sorting,"+ranklist);
		
		listOfObjects.add(1);
		listOfObjects.add(2);
		listOfObjects.add(1);
		listOfObjects.add("Hindustan");
		listOfObjects.add("Aeronautics");
		listOfObjects.add("Limited");
		listOfObjects.add("Turnover:");
		listOfObjects.add(100000L);
		listOfObjects.add("Dollars");
		//print list
		System.out.println(listOfObjects);
		//remove 2nd element
		listOfObjects.remove(1);
		System.out.println("After removal of 2nd element, collection i memory:");
		System.out.println(listOfObjects);
		listOfObjects.remove(7);
		if(listOfObjects.contains("Dollars"))
		{
			System.out.println("Turnover is in Dollars");
		}
		else{
			System.out.println("turnover is Rupees");
			
		}
		//display departments
		Iterator deptitr=departmentList.iterator();
		System.out.println("department list:");
		while(deptitr.hasNext()){
			System.out.println(deptitr.next()+"\t");
			
		}
		
Iterator itr=listOfObjects.iterator();
while(itr.hasNext()){
	Object element=itr.next();
	if(element instanceof String){
		System.out.println(element+" ");
	}
	else if(element instanceof Long){
		System.out.println(element);
	}
	else if(element instanceof Integer){
		System.out.println("Integer:"+element);
	}
}
//display a collection using enhanced for loop
System.out.println("showing elements of Arraaylist:");
for(Object o:listOfObjects)
{
	System.out.println(o);
}
	}

}
