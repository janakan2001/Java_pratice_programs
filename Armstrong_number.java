package date3004;
import java.util.*;
public class Armstrong_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int prod = num;
		int amst=0;
		int digit = digits(prod);
		while(prod>0)
		{
			int ld=prod%10;
			amst = (int) (amst+Math.pow(ld,digit)) ;
			prod = prod/10;
			
		}
		if(amst==num)
		{
			System.out.println("The given is an Armstrong number");
		}
		else
		{
			System.out.println("The given is not an armstrong number");
		}
		
	}
	public static int digits(int n)
	{
		int no=0;
		while(n>0)
		{
			no++;
			n=n/10;
		}
		return no;
	}

}
