package Queue;

public class queue {
	int a[];
	int rear, front;
	int size;

	public queue(int size) {
		this.size = size;
		rear = front = -1;
		a = new int[size];
	}

	public boolean isempty(){
		return (rear == -1 && front== -1);
	}

	public boolean isfull(){
		return rear == size;
	}

	public boolean enque(int data) {
		if(isfull())
			return false;
		System.out.println(rear);
		a[++rear]=data;
		return true;
	}
	
	public boolean deenque() {
		if(isempty())
			return false;
		front++;
		return true;
	}
	
	public int get()
	{
		if(isempty())
			return -1;
		
		return a[front+1];	
	}
}
