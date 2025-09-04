import java.util.*;
class Book_Constructor_Overloading
{
	int bookid;
	String name;
	float price;
	Book_Constructor_Overloading()
	{
		bookid=1;
		name="Java";
		price=100;
	}
	Book_Constructor_Overloading(int id,float p)
	{
		bookid=id;
		name="Vb.net";
		price=p;
	}
	Book_Constructor_Overloading(int id,String nm)
	{
		bookid=id;
		name=nm;
		price=300;
	}
	Book_Constructor_Overloading(int id,String nm,float p)
	{
		bookid=id;
		name=nm;
		price=p;
	}
	void disp_book_info()
	{
		System.out.println("Book ID:"+bookid);
		System.out.println("Book Name:"+name);
		System.out.println("Book Price:"+price);
	}
	public static void main(String args[])
	{
		Book_Constructor_Overloading b1=new Book_Constructor_Overloading();
		Book_Constructor_Overloading b2=new Book_Constructor_Overloading(2,200);
		Book_Constructor_Overloading b3=new Book_Constructor_Overloading(3,"DBMS");
		Book_Constructor_Overloading b4=new Book_Constructor_Overloading(4,"CNE",400);
		b1.disp_book_info();
		b2.disp_book_info();
		b3.disp_book_info();
		b4.disp_book_info();
	}
}