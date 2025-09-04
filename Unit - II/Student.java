import java.lang.*;
import java.util.*;
class Student
{
	int rollno;
	String name;
	float marks;
	void get_stud_info()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Roll NO:");
		rollno=sc.nextInt();
		System.out.println("Enter Student Name:");
		name=sc.next();
		System.out.println("Enter Student Marks:");
		marks=sc.nextFloat();
	}
	void disp_stud_info()
	{
		System.out.println("Roll No:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Marks:"+marks);
	}
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.get_stud_info();
		s1.disp_stud_info();
	}
}