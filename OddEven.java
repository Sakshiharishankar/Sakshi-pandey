import java.util.*;
class OddEven
{
	public static void main(String[] args)
	{
		int num;
		System.out.println("Enter the number u want to check whether it is odd or even :");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("The number "+num+" is even");
		}
		
		else
		{
			System.out.println("The number "+num+" is odd!!!");
		}
	}
}

