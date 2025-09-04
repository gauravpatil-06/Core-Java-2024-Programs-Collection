import java.util.*;
class Book
{
	int bookid;
	String name;
	float price;
	void get_book_info()
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
		Book b1=new Book();
		Book b2=new Book();
		b1.get_book_info();
		b2.get_book_info();
		b1.disp_book_info();
		b2.disp_book_info();
	}
}