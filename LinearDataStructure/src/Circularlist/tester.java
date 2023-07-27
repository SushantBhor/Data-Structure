package Circularlist;

public class tester {

	public static void main(String[] args) 
	{
		Circularlinkedlist s=new Circularlinkedlist();
		System.out.println("Insert At last Node ");
		 System.out.println(s.insertatlast(10));
		 System.out.println(s.insertatlast(20));
		 System.out.println(s.insertatlast(30));
		 s.display();
		
System.out.println("------------------------------------");

		 
		 System.out.println("Insert At position Node ");
		 System.out.println(s.insertpos(30,1));
		 System.out.println(s.insertpos(40,2));
		 s.display();
		 
System.out.println("------------------------------------");
		 
		 System.out.println("delet at Node ");
		 System.out.println(s.deletebypos(1));
		 System.out.println(s.deletebypos(2));
		 s.display();
		 
System.out.println("------------------------------------");
		 
		 System.out.println("delet at Node by val");
		 System.out.println(s.deletebyval(10));
		 System.out.println(s.deletebyval(20));
		 s.display();
	}
}
