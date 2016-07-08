import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map;
import java.util.Objects;
import java.util.Iterator;
import java.util.Set;
public class Details {

   public static void main(String args[]) 
   {

      	HashMap<String, String> hmap = new HashMap<String, String>();

      	hmap.put("GBR", "United Kingdom of Great Britain and Northern Ireland");
      	hmap.put("IDN", "Indonesia");
      	hmap.put("IND", "India");
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter The Country Code Or The Country Name: ");
		String str = scn.next();
		if (str.length() > 3)
		{
			for (String temp : hmap.keySet())
			{
				if (Objects.equals(hmap.get(temp) , str) == true)
					System.out.println("Country Code Of " + str + " is: " + temp);
			}
      	}
      	else
      	{
		  	String var= hmap.get(str);
		  	System.out.println("Country Name At index " + str + " is: " + var);
		}
      	System.out.print("\nList Of Every Single Value:\n");  
		Set set = hmap.entrySet();
      	Iterator iterator = set.iterator();
      	while(iterator.hasNext()) 
      	{
         	Map.Entry mentry = (Map.Entry)iterator.next();
         	System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
         	System.out.println(mentry.getValue());
      	}
   }
}
