package date3004;
import java.util.*;
public class positive_or_negative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Integer number :");
		int a=sc.nextInt();
		if(a>=0)
		{
			System.out.println(a+" is an positive integer");
		}
		else
		{
			System.out.println(a+" is an negative integer");
		}
	}

}
