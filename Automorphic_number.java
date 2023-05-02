package date3004;
import java.util.*;
public class Automorphic_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		int square = a*a;
		int digits = no_of_digits(a);
		
		if(square%(Math.pow(10, digits)) == a)
		{
			System.out.println("The given number is an automorphic number ");
		}
		else
		{
			System.out.println("The given number is not an automorphic number");
		}
	}
	public static int no_of_digits(int num)
	{
		int no=0;
		while(num>0)
		{
			no++;
			num=num/10;
		}
		return no;
	}

}
