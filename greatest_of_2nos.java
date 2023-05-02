package date3004;
import java.util.*;
public class greatest_of_2nos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer value :");
		int a = sc.nextInt();
		System.out.println("Enter an integer value :");
		int b = sc.nextInt();
		
		if(a>b)
		{
			System.out.println(a+" is the greatest among the both");
		}
		else
		{
			System.out.println(b+" is the greatest among the both");
		}
	}

}
