package date3004;
import java.util.*;
public class factors_of_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number :");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i+"\n");
			}
		}
		
	}

}
