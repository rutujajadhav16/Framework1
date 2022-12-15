package Velocity;

public class ConstructorDemo {
int a;
int b;


	 ConstructorDemo()
	{
		System.out.println("This is constructor");
		a=20;
		b=30;
	}
	public void add()
	{
		int sum=a+b;
		System.out.println("Addition is "+sum);
		
	}
	ConstructorDemo(int c, int d)
	{
		
		int sub=c-d;
		System.out.println("Subtraction is "+sub);
	}
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo c=new ConstructorDemo();
		c.add();
		ConstructorDemo c1=new ConstructorDemo(30, 20);

	}*/

}
