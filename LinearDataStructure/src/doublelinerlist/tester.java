package doublelinerlist;

public class tester {

	public static void main(String[] args) 
	{
		Doublelinearlist s=new Doublelinearlist();
		System.out.println("Insert At last Node ");
		 System.out.println(s.insert(10,1));
		 System.out.println(s.insert(20,1));
		 System.out.println(s.insert(30,2));
		 System.out.println(s.insert(40,1));
		 System.out.println(s.insert(50,3));
		 s.display();
		

		 
System.out.println("------------------------------------");
		 
		 System.out.println("delet at Node ");
		 System.out.println(s.deletebypos(1));
		 System.out.println(s.deletebypos(2));
		 s.display();
		 

	}
}
