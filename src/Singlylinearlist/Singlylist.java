package Singlylinearlist;
public class Singlylist {
	public node head;

	public Singlylist() {
		head = null;
	}

	public boolean insertatfirst(int data) {
		node n = new node(data);
		if (n == null) {
			return false;
		}

		if (head == null) {
			head = n;
			return true;
		}
		n.setNext(head);
		head = n;
		return true;
	}

	public boolean insertatlast(int data) {
		node n = new node(data);
		if (n == null) {
			return false;
		}
		if (head == null) {
			head = n;
			return true;
		}

		node temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(n);
		return true;
	}

	public boolean insertatpos(int data, int pos) {
		if (pos <= 0 || (head == null && pos > 1)) {
			return false;
		}

		node n = new node(data);
		if (n == null)
			return false;
		if (pos == 1) {
			n.setNext(head);
			head = n;
			return true;
		}

		node temp = head;
		for (int i = 1; i < pos - 1; i++) {
			temp = temp.getNext();
			if (temp == null)
				return false;
		}
		n.setNext(temp.getNext());
		temp.setNext(n);
		return true;
	}

	public void display() {
		node temp = head;

		while (temp != null) {
			System.out.print(temp.getData() + " , ");
			temp = temp.getNext();
		}
	}

	public boolean deletefirst() {
		if (head == null)
			return false;
		head = head.getNext();
		return true;
	}

	public boolean deletelast() {
		if (head == null)
			return false;

		node temp = head;
		while (temp.getNext().getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(null);
		return true;
	}

	public boolean deletebypos(int pos) {
		if (pos <= 0 || (head == null && pos > 1))
			return false;

		if (pos == 1)
			head = null;

		node temp = head;

		for (int i = 1; i < pos - 1; i++) {
			temp = temp.getNext();
		}

		temp.setNext(temp.getNext().getNext());
		return true;
	}

	public boolean deletebyval(int val) {
		if (head == null)
			return false;

		if (head.getData() == val) {
			head = head.getNext();
			return true;
		}
		node prev = head, del = head;
		
		while (del.getData() != val)
		{
			prev = del;
			del = del.getNext();
			if (del == null)
				return false;
		}

		prev.setNext(del.getNext());
		return true;
	}
}
