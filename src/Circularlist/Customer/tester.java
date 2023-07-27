package Circularlist.Customer;

//import Customer.Customer;

public class tester {

	public static void main(String[] args) 
	{
//		id, String fname, String lname, int age
		Customer c= new Customer( 1, "Akshay" , "Yelekar" , 21);
		Customer c1= new Customer( 2, "Akshay1" , "Yelekar" , 20);
		Customer c2= new Customer( 3, "Akshay2" , "Yelekar" , 23);
		Customer c3= new Customer( 4, "Akshay3" , "Yelekar" , 23);
		Customer c4= new Customer( 5, "Akshay4" , "Yelekar" , 23);
		
		Circularlinkedlist s=new Circularlinkedlist();
		System.out.println("Insert At last Node ");
		 System.out.println(s.insertatlast(c));
		 System.out.println(s.insertatlast(c1));
		 System.out.println(s.insertatlast(c2));
		 s.display();
		
System.out.println("------------------------------------");

		 
		 System.out.println("Insert At position Node ");
		 System.out.println(s.insertpos(c3,1));
		 System.out.println(s.insertpos(c4,2));
		 s.display();
		 
System.out.println("------------------------------------");
		 
		 System.out.println("delet at Node ");
		 System.out.println(s.deletebypos(1));
		 System.out.println(s.deletebypos(2));
		 s.display();
		 
System.out.println("------------------------------------");
		 
		 System.out.println("delet at Node by val");
		 System.out.println(s.deletebyval(c));
		 System.out.println(s.deletebyval(c2));
		 s.display();
	}
}
