import java.util.Scanner;
import static java.lang.Math.pow;

public class Wordify
{
	public static String primitive[] = {
		"",
		" one",
		" two",
		" three",
		" four",
		" five",
		" six",
		" seven",
		" eight",
		" nine",
		" ten",
		" eleven",
		" twelve",
		" thirteen",
		" fourteen",
		" fifteen",
		" sixteen",
		" seventeen",
		" eighteen",
		" nineteen"
	};
	
	public static String tens[] = {
		"",
		" ten",
		" twenty",
		" thirty",
		" forty",
		" fifty",
		" sixty",
		" seventy",
		" eighty",
		" ninety"
	};
	
	public static String super_word[] = {
		"",
		"",
		" hundred",
		" thousand",
		"",
		" lakh",
		"",
		" crore"
	};
	
	public static String wordify(long digit)
	{
		if (digit < 10000000)
		{
			int level = Long.toString(digit).length();
	
			if (level > 3 && level < 8 && level % 2 != 0)
				--level;
	
			if (digit < 20)
				return primitive[(int) digit];
	
			else if(digit < 100)
				return tens[(int) digit / 10] + wordify(digit % 10);
	
			else
				return wordify(digit / (long)Math.pow(10 , --level)) + super_word[level] + wordify(digit % (long)Math.pow(10,level));
	
		}
		else
		{
			int level = Long.toString(digit).length();
			return wordify(digit / (long)Math.pow(10,7)) + super_word[7] + wordify(digit % (long)Math.pow(10,7));
		}
	}
	
	public static void main(String args[])
	{
		long n;
		System.out.print("Enter a Number : ");
		Scanner in = new Scanner(System.in);
		n = in.nextLong();
		String s = wordify(n);
		System.out.print("The Amount Is : " + s + "\n");
	}
}
	
