package Velocity;

public class NestedIfElse {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age=20;
		float weight=60;
		
		if(age>=18)
		{
			if(weight>=50)
			{
				System.out.println("I am eligible for blood donation ");
			}
			else
			{
				System.out.println("age should be in criteria");
			}
			
		}
		else
		{
			System.out.println("I am not eligible for blood donation");
		}
			
		
	}

}
