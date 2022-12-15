package Velocity;

public interface Demo
{
	int a=20;
	
	default void add()
	{
		int a=10;
		System.out.println(this.a);
	}
	public static void add1()
	{
		
	}
	//public void add();
	
}
