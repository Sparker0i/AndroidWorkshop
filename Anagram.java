import java.util.*;
import java.lang.*;

public class Anagram
{
    public static void main(String args[])
    {
        String str1,str2;
        System.out.print("Enter two Strings:\n");
        Scanner scanner = new Scanner(System.in);
        str1 = scanner.next();
        str2 = scanner.next();
        char[] c = str1.toCharArray();
        char[] d = str2.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
		if(Arrays.equals(c,d) == true)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagrams");
	}
}
