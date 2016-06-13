import java.util.Scanner;

public class Upper
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		String Orange;
		System.out.print("Enter Anything : ");
		Orange = scanner.next();
		System.out.print("\nYou Entered : " + Orange.toUpperCase() + "\n");
	}
}
