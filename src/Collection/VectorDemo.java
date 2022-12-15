package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args)
	{
		Vector <Object> v=new Vector<>();
		
		v.add("Pune");
		v.add(12);
		v.add(null);
		v.add("Kop");
		v.add(13);
		v.add(null);
		
		/*System.out.println(v.capacity());
		System.out.println(v.size());
		v.add(3,14);
		System.out.println(v.size());
		System.out.println(v);
		System.out.println(v.contains("pune"));
		
		System.out.println(v.elementAt(4));
		v.insertElementAt("Mum", 4);
		System.out.println(v);
		
		Object a=v.getClass();
		System.out.println(a);
		int b=v.hashCode();
		System.out.println(b);
		int c=v.indexOf(null, 3);
		System.out.println(c);*/
		System.out.println(v);
		System.out.println(v.set(2, 13));
		System.out.println(v);
		v.setSize(4);
		System.out.println(v);
	
		
		for (Object o : v) 
		{
			System.out.println(o);
		}
		
		Iterator it=v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		Enumeration e=v.elements();
				while(e.hasMoreElements())
				{
					System.out.println(e.nextElement());
				}
	
	}

}
