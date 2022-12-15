package Velocity;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int num=100;
		if(num>=1 && num<=9)
		{
			System.out.println("Number is 1 digit");
		}
		else if(num>10 && num<=99)
		{
			System.out.println("number is 2 digit");
		}
		else if(num>=100 && num<=999)
		{
			System.out.println("number is 3 digit");
		}
		else
		{
			System.out.println("number is more 3 digit");
		}
	}

}
