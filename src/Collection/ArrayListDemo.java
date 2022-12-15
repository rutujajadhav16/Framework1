package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList <Object> al=new ArrayList<> ();
	//	ArrayList <Integer> al=new ArrayList<> ();
		al.add("Pune");
		al.add(1234);
		al.add("Mumbai");
		al.add('R');
		al.add(16.2f);
		
		System.out.println(al);
		
	/*	int a=al.size();
		System.out.println(a);
		
		al.add(2,"Kolhapur");
		System.out.println(al);
		
		al.remove(0);
		System.out.println(al);
		
		al.remove("Mumbai");
		System.out.println(al);*/
		
	/*	Object a1=al.get(3);
		System.out.println(a1);
		
		System.out.println(al.contains('R'));
		
		al.set(4, 12);
		System.out.println(al);*/
		
		System.out.println(al.isEmpty());
		System.out.println(al.clone());
		
		for(int i=0;i<al.size();i++)
		{
				Object a2=al.get(i);
				System.out.println(a2);
		}
		
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
