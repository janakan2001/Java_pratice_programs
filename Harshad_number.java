package date3004;
import java.util.*;
public class Harshad_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int ans = sum_of_digits(num);
		if(num%ans==0)
		{
			System.out.println("The given number is an Harshad Number");
		}
		else
		{
			System.out.println("The given number is not an Harshad Number");
		}
		
	}
	public static int sum_of_digits(int n)
	{
		int sum=0;
		while(n>0)
		{
			int ld = n%10;
			sum = sum+ld;
			n = n/10;
		}
		return sum;
	}

}
