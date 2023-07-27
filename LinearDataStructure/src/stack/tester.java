package stack;

public class tester {
	
	public static void main(String[] args) {
		Stack s=new Stack(5);
		System.out.println(s.push(10));//t
		System.out.println(s.push(20));
		System.out.println(s.push(30));
		System.out.println(s.push(40));
		System.out.println(s.push(50));
		
		System.out.println(s.push(60));//f
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		System.out.println(s.peek());//30
		
	}
}
