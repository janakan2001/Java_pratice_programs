package date3004;
import java.util.*;
public class Abundant_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		
		int sum=0;
		for(int i=1;i<=a/2;i++)
		{
			if(a%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum>a)
		{
			System.out.println("The given number "+a+" is abundant");
			System.out.println("The abundance is "+(sum-a));
		}
		else
		{
			System.out.println("The given number "+a+" is not abundant");
		}
	}

}
