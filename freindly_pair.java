package date3004;
import java.util.*;
public class freindly_pair {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Pair :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int suma = sum_of_div(a);
		int sumb = sum_of_div(b);
		
		if(suma/a == sumb/ b)
		{
			System.out.println("The given is Friendly pair");
		}
		else
		{
			System.out.println("The given is not an Friendly pair");
		}
		
	}
	
	public static int sum_of_div(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}

}
