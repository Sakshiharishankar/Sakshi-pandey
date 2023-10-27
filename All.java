import java.util.*;
class All
{
	public static void main(String[] args)
	{
		int r=0,temp,k=0,flag=0,sum=0;
		int num;
		int ch;
		System.out.println("\n1.Prime number\n2.Palindrome number\n3.Odd or Even");
		
		System.out.println("Enter your choice :");
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		System.out.println("Enter the number:");
		Scanner m=new Scanner(System.in);
		num=m.nextInt();
		switch(ch)
		{
		case 1:
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
		break;	
		
			case 2:
			
			temp=num;
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		
		if(temp==sum)
		{
			System.out.println("Number is palindrome number ");
		}
		else
		{
			System.out.println("Number is not palindrome number !");
		}
		break;
		
		case 3:
		
		if(num%2==0)
		{
			System.out.println("The number "+num+" is even");
		}
		
		else
		{
			System.out.println("The number "+num+" is odd!!!");
		}
			
			break;
				
		}
		
		
	}
}
