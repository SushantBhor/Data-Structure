package CircularQueue.copy;

public class circularqueue {
	int a[];
	int rear, front;
	int size;

	public circularqueue(int size) {
		this.size = size;
		rear = front = -1;
		a = new int[size];
	}

	public boolean isempty(){
		return (rear==front && rear==-1);
	}

	public boolean isfull(){
		return (rear == size-1 && front==-1)||( rear==front && rear!=-1);
	}

	public boolean enque(int data) 
	{
		if(isfull())
			return false;
		
		rear=(rear+1)%size;
		a[rear]=data;
		return true;
	}
	
	public boolean deenque() {
		if(isempty())
			return false;
		front=(front+1)%size;
		return true;
	}
	
	public int get()
	{
		if(isempty())
			return -1;
		
		return a[front+1];	
	}
}
