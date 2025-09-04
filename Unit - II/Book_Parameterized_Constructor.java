import java.util.*;
class Book_Parameterized_Constructor
{
	int bookid;
	String name;
	float price;
	Book_Parameterized_Constructor(int id,String nm,float p)
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
		Book_Parameterized_Constructor b1=new Book_Parameterized_Constructor(1,"Java",100);
		Book_Parameterized_Constructor b2=new Book_Parameterized_Constructor(2,"Vb.net",99);
		b1.disp_book_info();
		b2.disp_book_info();
	}
}