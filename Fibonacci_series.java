package date3004;
import java.util.*;
public class Fibonacci_series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n val:");
		int num = sc.nextInt();
		
		int first=0;
		int second = 1;
		System.out.println(first);
		System.out.println(second);
		while(num-2>0)
		{
			int third = first+second;
			System.out.println(third);
			first = second;
			second = third;
			num--;
			
		}
	}

}
