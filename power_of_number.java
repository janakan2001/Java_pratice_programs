package date3004;
import java.util.*;
public class power_of_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number (Base) :");
		int num = sc.nextInt();
		System.out.println("Enter a number (Power) :");
		int pow = sc.nextInt();
		int ans=1;
		for(int i=1;i<=pow;i++)
		{
			ans = ans*num;
		}
		System.out.println("The power a the number is "+ans);
		
	}

}
