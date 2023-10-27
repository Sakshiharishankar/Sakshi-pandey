import java.util.*;
class PrimeNumber
{
	public static void main(String[] args)
	{
		int k=0,flag=0;
		int num;
		System.out.println("Enter the number to be checked wheyher it is prime or not :");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		k=num/2;
		if(num==0||num==1)
		{
			System.out.println("Number is not prime");		
		}
		else
		{
			for(int i=2;i<=r;i++)
			{
				if(num%i==0)
				{
					System.out.println("Number is not prime");	
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("Number is prime");	
			}
		}	
	}
}
