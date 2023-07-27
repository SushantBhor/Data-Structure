package stack;

public class Stack 
{
	int[] a;
	int size;
	int top;

	public Stack(int size) {
		this.size = size;
		a = new int[size];
		top = -1;
	}

	public boolean isempty() {
		return top == -1;
	}

	public boolean isfull() {
		return top == size-1;
	}

	public boolean push(int data) {
		if (isfull()) 
		{
			return false;
		}
		a[++top] = data;
		//System.out.println(top);
		return true;
	}

	public boolean pop() {
		if (isempty()) {
			return false;
		}
		top--;
		return true;
	}

	public int peek() {
		if (isempty()) {
			return -1;
		}
		return a[top];
	}
	
	public void display()
	{
		int i=0;
		while(i<=top)
		{
			System.out.print(a[i]+" ");
		}
	}
	
}
