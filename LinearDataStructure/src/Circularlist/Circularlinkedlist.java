package Circularlist;

public class Circularlinkedlist {

	public node head;

	public Circularlinkedlist() {
		head = null;
	}

	public boolean insertatlast(int data) {

		node n = new node(data);
		if (n == null)
			return false;

		if (head == null) {
			head = n;
			n.setNext(head);
			return true;
		}
		node temp = head;
		while (temp.getNext() != head) {
			temp = temp.getNext();
		}
		n.setNext(head);
		temp.setNext(n);
		return true;
	}

	public boolean insertpos(int data, int pos) {
		if (pos <= 0 || (head == null && pos > 1))
			return false;
		node n = new node(data);
		if (pos == 1) {
			if (head == null) {
				head = n;
				n.setNext(head);
				return true;
			}
			node temp = head;
			System.out.println(temp + " " + head);
			while (temp.getNext() != head) {
				temp = temp.getNext();
			}

			n.setNext(head);
			head = n;
			temp.setNext(n);
			return true;
		}

		node temp = head;
		for (int i = 1; i < pos - 1; i++) {
			temp = temp.getNext();
			if (temp == head)
				return false;
		}
		n.setNext(temp.getNext());
		temp.setNext(n);
		return true;
	}

	public boolean deletebypos(int pos) {
		if (pos <= 0 || (head == null && pos > 1))
			return false;

		if (pos == 1) 
		{
			if (head.getNext() == head) {
				head = null;
				return true;
			}
			
			node temp = head;
			while (temp.getNext() != head) {
				temp = temp.getNext();
			}

			head = head.getNext();
			temp.setNext(head);
			return true;
		}
		node prev = head, del = head;

		for (int i = 1; i < pos; i++) {
			prev = del;
			del = del.getNext();
			if (del == head)
				return false;
		}
		prev.setNext(del.getNext());
		return true;
	}

	public void display() {
		if (head == null)
			return;
		node temp = head;
		while (temp.getNext() != head) {
			System.out.print(temp.getData() + " , ");
			temp = temp.getNext();
		}
		System.out.print(temp.getData());
	}

	public boolean deletebyval(int data) {
		if (head == null)
			return false;

		if (data == head.getData()) {
			if (head.getNext() == head) {
				head = null;
				return true;
			}
			node temp = head;
			while (temp.getNext() != head) {
				temp = temp.getNext();
			}
			temp.setNext(head.getNext());
			head = head.getNext();
			return true;
		}

		node prev = head, del = head;
		while (del.getData() != data) {
			prev = del;
			del = del.getNext();
			if (del == head)
				return false;
		}
		prev.setNext(del.getNext());
		return true;
	}

}
