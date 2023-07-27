package CircularQueue.copy;

import java.util.Arrays;

public class tester {

	public static void main(String[] args) {
		circularqueue q = new circularqueue(5);

		System.out.println(q.enque(10));
		System.out.println(q.enque(20));
		System.out.println(q.enque(30));
		System.out.println(q.enque(40));
		System.out.println(q.enque(50));

		System.out.println(q.deenque());

		System.out.println(q.enque(60));
		
		System.out.println(q.get());		
		System.out.println(q.deenque());
		System.out.println(q.get());
		//System.out.println(Arrays.toString(q.a));

	}

}
