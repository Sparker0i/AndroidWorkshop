import java.util.Scanner;       //Similar to Header Files in C++

public class Input
{
	public static void main(String args[])
	{
		int UserInput;
		Scanner scanner = new Scanner(System.in);           //Imports scanf()
		System.out.print("\nEnter an Integer :: ");      //printf()
		UserInput = scanner.nextInt();           //Next integer being typed gets assigned to user input
		System.out.println("You Entered " + UserInput + "\n");
	}
}
