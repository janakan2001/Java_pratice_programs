package date3004;
import java.util.*;
public class odd_or_even {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Number :");
		int no = sc.nextInt();
		
		if(no%2==0)
		{
			System.out.println(no+" is an EVEN number");
		}
		else
		{
			System.out.println(no+" is an ODD number");
		}
		
	}

}
