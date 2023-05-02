package date3004;
import java.util.*;
public class palindrome_of_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int prod = num;
		
		int rev=0;
		while(prod>0)
		{
			int ld=prod%10;
			rev = rev*10+ld;
			prod = prod/10;
		}
		if(rev==num)
		{
			System.out.println("The given number "+num+" is a plaindrome");
		}
		else
		{
			System.out.println("The given number is not an palindrome");
		}
	}

}
