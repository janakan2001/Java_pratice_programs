package date3004;
import java.util.*;
public class Prime_factors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				boolean check = is_prime(i);
						if(check==true)
						{
							System.out.println(i+"\n");
						}
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
			return true;
		else
			return false;
	}

}
