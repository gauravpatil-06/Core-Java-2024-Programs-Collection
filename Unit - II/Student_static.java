import java.lang.*;
import java.util.*;
class Student_static
{
	int rollno;
	String name;
	float marks;
	static String college_name="GPM";
	Student_static()
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
		System.out.println(rollno+"\t\t"+name+"\t\t"+marks+"\t\t"+college_name);
		
	}
	public static void main(String args[])
	{
		Student_static s1=new Student_static();
		Student_static s2=new Student_static();
		Student_static s3=new Student_static();
		Student_static s4=new Student_static();
		System.out.println("Roll No\t\tName\t\tMarks\t\tcollege name");
		s1.disp_stud_info();
		s2.disp_stud_info();
		s3.disp_stud_info();
		s4.disp_stud_info();
	}
}