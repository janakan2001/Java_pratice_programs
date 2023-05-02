package date3004;
import java.util.*;
public class prime_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int ct=0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				ct++;
			}
		}
		if(ct==2)
		{
			System.out.println(n+" is prime number");
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}
	}

}
