import java.util.*;
class Book_Copy_Constructor
{
	int bookid;
	String name;
	float price;
	Book_Copy_Constructor()
	{
		
		bookid=1;
		name="Java";
		price=100;
	}
	Book_Copy_Constructor(Book_Copy_Constructor b1)
	{
		bookid=b1.bookid;
		name=b1.name;
		price=b1.price;
	}
	void disp_book_info()
	{
		System.out.println("Book ID:"+bookid);
		System.out.println("Book Name:"+name);
		System.out.println("Book Price:"+price);
	}
	public static void main(String args[])
	{
		Book_Copy_Constructor b1=new Book_Copy_Constructor();
		Book_Copy_Constructor b2=new Book_Copy_Constructor(b1);
		System.out.println("****Object s1****");
		b1.disp_book_info();
		System.out.println("****Object s2****");
		b2.disp_book_info();
	}
}