package doublelinerlist;

public class node {

	public int data;
	public node next;
	public node prev;
	
	public node(int data) {
		this.data = data;
		this.next =null;
		this.prev=null;
	}

	public node getPrev() {
		return prev;
	}

	public void setPrev(node prev) {
		this.prev = prev;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public node getNext() {
		return next;
	}

	public void setNext(node next) {
		this.next = next;
	}
}
