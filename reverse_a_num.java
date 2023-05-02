package date3004;
import java.util.Scanner;
public class reverse_a_num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		
		int rev=0;
		
		while(num>0)
		{
			int ld=num%10;
			rev = (rev*10)+ld;
			num=num/10;
		}
		
		System.out.println("The reverse of given number is:"+rev);
		
	}

}
