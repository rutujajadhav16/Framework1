package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {

	public static void main(String[] args) 
	{
		
		HashSet hs=new HashSet();
		hs.add("Pune");
		hs.add(null);
		hs.add(12);
		hs.add(null);
		hs.add('A');
		
		
		System.out.println(hs.contains("pune"));
		System.out.println(hs);
		
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
