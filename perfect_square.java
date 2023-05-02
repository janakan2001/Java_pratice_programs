package date3004;
import java.util.*;
public class perfect_square {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		if(Math.floor(Math.sqrt(a)) == Math.ceil(Math.sqrt(a)))
		{
			System.out.println("The given number "+a+" is an perfect square");
		}
		else
		{
			System.out.println("It is not an perfect Square");
		}
	}

}
