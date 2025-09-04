//Note: In this program, I assume 5%TA, 10% DA and 15% HRA of basic salary.
import java.util.*;
interface Salary
{
	int Basic_Salary=1000;
	void Basic_salary();
}
class Employee
{
	int emp_id;
	String emp_name,emp_city,emp_designation;
	int emp_age;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee ID:");
		emp_id=sc.nextInt();
		System.out.println("Enter Employee Name:");
		emp_name=sc.next();
		System.out.println("Enter Employee City:");
		emp_city=sc.next();
		System.out.println("Enter Employee Designation:");
		emp_designation=sc.next();
		System.out.println("Enter Employee Age:");
		emp_age=sc.nextInt();
	}
	void display()
	{
		System.out.println("Employee ID:"+emp_id);
		System.out.println("Employee Name:"+emp_name);
		System.out.println("Employee Age:"+emp_age);
		System.out.println("Employee city:"+emp_city);
		System.out.println("Employee Designation:"+emp_designation);
	}
}
class Gross_Salary extends Employee implements Salary
{
	int TA,DA,HRA;
	void get_salary()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter TA:");
		TA=sc.nextInt();
		System.out.println("Enter DA:");
		DA=sc.nextInt();
		System.out.println("Enter HRA:");
		HRA=sc.nextInt();
	}
	public void Basic_salary()
	{
		TA=(Basic_Salary*TA)/100;
		DA=(Basic_Salary*DA)/100;
		HRA=(Basic_Salary*HRA)/100;
	}
	void Total_Salary()
	{
		int total=(Basic_Salary+TA+DA+HRA);
		System.out.println("Basic Salary:"+Basic_Salary);
		System.out.println("TA:"+TA);
		System.out.println("DA:"+DA);
		System.out.println("HRA:"+HRA);
		System.out.println("Total Salary:"+total);
	}
	public static void main(String args[])
	{
		Gross_Salary g1=new Gross_Salary();
		g1.getdata();
		g1.get_salary();
		g1.Basic_salary();
		g1.display();
		g1.Total_Salary();
	}
}