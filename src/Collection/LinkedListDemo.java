package Collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LinkedList lt=new LinkedList();
		lt.add("list");
		lt.add(1);
		lt.add('a');
		lt.add(null);
		lt.add(null);
		lt.add("list");
		/*System.out.println(lt);
		
		lt.add(4,"Hi");
		System.out.println(lt);
		LinkedList lst=new LinkedList();
		lst.add("bye");
		lst.add(15);
		lst.add('b');
		
		lt.addAll(lst);
		System.out.println(lt);*/
		
		lt.addFirst("link");
		System.out.println(lt);
		
		
		Object o=lt.element();
		System.out.println(o);
		lt.offer("2");
		System.out.println(lt);
		
		Object o1=lt.peekFirst();
		System.out.println(o1+" "+lt);
		
		
	
	}

}
