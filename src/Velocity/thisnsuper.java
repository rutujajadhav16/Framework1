package Velocity;

public class thisnsuper 
{
static int a=20;
thisnsuper()
{
	this(5);
}
thisnsuper(int b)
{
	final int b1=b;
	System.out.println("Constructor "+b1);
}
public void add(int a)
{

	this.add();
	
}
	public void add()
	{
		int a=10;
		int sum=a+this.a;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		thisnsuper s=new thisnsuper();
		s.add();
		s.add(20);
		
	}

}
