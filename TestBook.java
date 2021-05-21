import java.util.*;
class Book
{
	String bname,author,publisher;
	Scanner s = new Scanner(System.in);
	long isbn;
	Book()
	{
		bname="Jivan";
		isbn=1000;
		author="Sarvajeet";
		publisher="Nilabh Books";
	}
	public void getbookname()
	{
		System.out.println("Enter book name");
		bname=s.nextLine();
	}
	public void getisbn()
	{
		System.out.println("Enter isbn number");
		isbn=s.nextLong();
		
	}
	public void getauthor()
	{
		System.out.println("Enter author name");
		author=s.nextLine();
    }
	public void getpublisher()
	{
		System.out.println("Enter publisher name");
		publisher=s.nextLine();
	
	}
	public void setBook(String bk)
	{
		bname=bk;
	}
	public void setIsbn(long isn)
	{
		isbn=isn;
	}
	public void setAuthor(String au)
	{
		author=au;
	}
	public void setPublisher(String pu)
	{
		publisher=pu;
	}
	public void dispInfo()
	{
		System.out.println("Book name : "+bname);
		System.out.println("ISBN number : "+isbn);
		System.out.println("Author name : "+author);
		System.out.println("Publisher name : "+publisher);
	}
}
class TestBook
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		Book b[] = new Book[30];
		int i=0;
		System.out.println("Enter number of books to store");
		int n = s.nextInt();
		System.out.println("Press 1 for get method\nPress 2 for set method");
		int ch = s.nextInt();
		if(ch==1)
		{
			for(i=0;i<n;i++)
			{
				System.out.println("\t\tENTER BOOK DETAILS");
				b[i]=new Book();
				b[i].getbookname();
				b[i].getisbn();
				b[i].getauthor();
				b[i].getpublisher();
			}
		}
		else
		{
			b[i]=new Book();
			b[i].setBook("Sethu");
			b[i].setIsbn(1001);
			b[i].setAuthor("Sarvaj");
			b[i].setPublisher("Nilabh");
		}
	System.out.println("\tENTERED BOOKS");
	for(i=0;i<n;i++)
	{
		b[i].dispInfo();
		System.out.println();
	}
	}
}