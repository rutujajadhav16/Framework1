package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo2 {

	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add('B');
		al.add('A');
		al.add('G');
		al.add('S');
		al.add('A');
//		System.out.println(al);
		
	/*	ArrayList a1=new ArrayList<>();
		a1.addAll(al);
		System.out.println(a1);
		
		a1.removeAll(al);
		System.out.println(a1);
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
		
		Collections.shuffle(al);
		System.out.println(al);
		
		System.out.println(al.set(1, 'a'));
		System.out.println(al);*/
		System.out.println(al.remove(1));
		System.out.println(al);
		
		for (Object a : al) 
		{
			System.out.println(a);
		}
		System.out.println("-------------Iterator------------------");		
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		//	System.out.println(al);
		}
		System.out.println("-------------For Loop------------------");	
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("-------------ListIterator------------------");	
		ListIterator lt=al.listIterator();
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
		
		
	
		
	}
	

}
