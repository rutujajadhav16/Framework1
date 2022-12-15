package Velocity;

public class MethhodDemo {

	public static void demo()
	{
		System.out.println("This is non main static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is main");
		demo();
		Staticmethod.test();
		Staticmethod s=new Staticmethod();
	}

}
