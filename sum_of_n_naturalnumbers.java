package date3004;
import java.util.*;
public class sum_of_n_naturalnumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of n :");
		int n = sc.nextInt();
		int sum=0;
		
		while(n>0)
		{
			sum = sum+n;
			n--;
		}
		System.out.println("The sum of First "+n+" Natural numbers is :"+sum);
	}

}
