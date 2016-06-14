import java.util.*;
import java.lang.*;
import java.io.*;

class Student
{
	static int rollNo , Attendance;
	static String Name;
	
	Student(int a , String b , int c)
	{	
		this.rollNo = a;
		this.Name = b;
		this.Attendance = c;
	}
	
	static void display()
	{
		System.out.print(Name + " " + rollNo + " " + Attendance + "\n");
	}
};

public class Stud
{
	public static void main(String args[]) throws IOException
	{
		FileReader file = new FileReader("Student.dat");
		BufferedReader br = new BufferedReader(file);
		String line = null;
		while ((line = br.readLine()) != null)
		{
			int Count = 0 , i;
			String[] attributes = line.split(",");
			for (i = 2; i < attributes.length ; ++i)
			{
				if (attributes[i].charAt(0) == 'P')
					++Count;
			}
			int rno = Integer.parseInt(attributes[0]);
			ArrayList<Student> ar = new ArrayList<Student> ();
			ar.add(new Student(rno , attributes[1] , Count));
			for (Student s:ar)
				s.display();
		}
	}
}
