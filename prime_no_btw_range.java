package date3004;
import java.util.*;
public class prime_no_btw_range {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the starting range :");
		int a = sc.nextInt();
		System.out.println("Eneter the ending range :");
		int b = sc.nextInt();
		
		for(int i=a;i<=b;i++)
		{
			boolean ans = is_prime(i);
			if(ans==true)
			{
				System.out.println(i);
			}
		}
		
		
	}
	public static boolean is_prime(int n)
	{
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
			return true;
		}
		else
		{
			return false;
		}
	}

}
