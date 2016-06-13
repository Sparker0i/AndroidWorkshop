import java.util.Scanner;
import static java.lang.Math.pow;

public class Armstrong
{
	public static void main(String args[])
	{
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter An Integer : ");
		n = scanner.nextInt();
		int temp = n , r , sum = 0;
		while (temp > 0)
		{
			r = temp % 10;
			sum += pow(r , 3);
			temp /= 10;
		}
		if (n == sum)
			System.out.print(n + " is an Armstrong Number\n");
		else
			System.out.print(n + " is not an Armstrong number\n");
	}
}
