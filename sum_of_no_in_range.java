package date3004;
import java.util.*;
public class sum_of_no_in_range {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting range :");
		int a = sc.nextInt();
		System.out.println("Enter the ending range :");
		int b = sc.nextInt();
		int sum=0;
		for(int i=a;i<=b;i++)
		{
			sum = sum+i;
		}
		System.out.println("The sum of numbers between the range is :"+sum);
	}

}
