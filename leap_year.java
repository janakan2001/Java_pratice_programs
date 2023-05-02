package date3004;
import java.util.*;
public class leap_year {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int year=sc.nextInt();
		if(year%400==0 && year%4==0)
		{
			System.out.println(year+" is an leap year");
		}
		else
		{
			System.out.println(year+" is not an leap year");
		}
	}

}
