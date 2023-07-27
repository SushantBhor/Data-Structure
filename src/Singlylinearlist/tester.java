package Singlylinearlist;

public class tester {

	public static void main(String[] args) 
	{
		Singlylist s=new Singlylist();
		System.out.println("Insert At First Node ");
		 System.out.println(s.insertatfirst(10));
		 System.out.println(s.insertatfirst(20));
		 s.display();
		
System.out.println("------------------------------------");

		 
		 System.out.println("Insert At last Node ");
		 System.out.println(s.insertatlast(30));
		 System.out.println(s.insertatlast(40));
		 s.display();
		 
System.out.println("------------------------------------");
		 
		 System.out.println("Insert At pos Node ");
		 System.out.println(s.insertatpos(50,3));
		 System.out.println(s.insertatpos(60,2));
		 s.display();
		 
System.out.println("------------------------------------");
		 
		 System.out.println("delete At first Node ");
		 System.out.println(s.deletefirst());
		 s.display();
		 
System.out.println("------------------------------------");
		 
		 System.out.println("delete At last Node ");
		 System.out.println(s.deletelast());
		 s.display();
		 
		 
System.out.println("------------------------------------");
		 
		 System.out.println("delete At position Node ");
		 System.out.println(s.deletebypos(3));
		 s.display();
		 
System.out.println("------------------------------------");
		 
		 System.out.println("delete by val");
		 System.out.println(s.deletebyval(10));
		 s.display();
	}
}
