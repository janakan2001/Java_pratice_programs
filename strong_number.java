package date3004;
import java.util.*;
public class strong_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int pro = num;
		int sum=0;
		while(num>0)
		{
			int ld = num%10;
			int fact = factorial(ld);
			sum = fact+sum;
			num=num/10;
		}
		if(sum==pro)
		{
			System.out.println("The given number "+pro+" is an strong number");
		}
		else
		{
			System.out.println("The given number "+pro+" is not an Strong number");
		}
		
	}
	public static int factorial(int n)
	{
		int fact =1;
		for(int i=1;i<=n;i++)
		{
			fact = fact*i;
		}
		return fact;
	}

}
