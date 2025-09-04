import java.util.*;
class Book_Default_Constructor
{
	int bookid;
	String name;
	float price;
	Book_Default_Constructor()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book ID:");
		bookid=sc.nextInt();
		System.out.println("Enter Book Name:");
		name=sc.next();
		System.out.println("Enter Book Price:");
		price=sc.nextFloat();
	}
	void disp_book_info()
	{
		System.out.println("Book ID:"+bookid);
		System.out.println("Book Name:"+name);
		System.out.println("Book Price:"+price);
	}
	public static void main(String args[])
	{
		Book_Default_Constructor b1=new Book_Default_Constructor();
		Book_Default_Constructor b2=new Book_Default_Constructor();
		b1.disp_book_info();
		b2.disp_book_info();
	}
}