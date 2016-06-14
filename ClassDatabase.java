import java.util.*;

class Student
{
	String name;
	int rollNumber;
	static int noOfStudents;
	
	Student(String name , int rollNumber)
	{
		this.name = name;
		this.rollNumber = rollNumber;
		this.noOfStudents++;
	}
	
	Student()
	{
		name = "DUDE";
		rollNumber = 10; //YF
		this.noOfStudents++;
	}
	
	void display()
	{
		System.out.print("Name : " + name + "\n");
		System.out.print("Roll Number : " + rollNumber + "\n");
		System.out.print("Number Of Students : " + noOfStudents + "\n\n");
	}
}

public class ClassDatabase
{
	public static void main(String args[])
	{
		ArrayList<Student> arrayList=new ArrayList<Student>();
		arrayList.add(new Student("Newton" , 1));
		arrayList.add(new Student());
		for (Student s:arrayList)
			s.display();
	}
}
