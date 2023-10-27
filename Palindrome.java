import java.util.*;
class Palindrome
{
	public static void main(String[] args)
	{
		int r,num,temp;
		int sum=0;
		
		System.out.println("Enter the number to check whether the number is palindrome :");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
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
	}
}
