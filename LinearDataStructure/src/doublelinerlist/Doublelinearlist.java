package doublelinerlist;

public class Doublelinearlist {

	public node head;

	public Doublelinearlist() {
		head = null;
	}

	public boolean insert(int data, int pos) {
		
		if (pos <= 0 || (head == null && pos > 1))
			return false;
		
		node n = new node(data);
		
		if (n == null)
			return false;

		if (pos == 1) {
			if (head == null) {
				head = n;
				return true;
			}

			n.setNext(head);
			head.setPrev(n);
			head = n;
			return true;
		}

		node temp = head;
		for (int i = 1; i < pos - 1; i++) {
			temp = temp.getNext();
			if (temp == null)
				return false;
		}
		node next = temp.getNext();
		n.setPrev(temp);
		temp.setNext(n);

		if (next != null) {
			n.setNext(next);
			next.setPrev(n);
		}
		return true;
	}

	public void display() {
		if (head == null)
			return;

		node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " , ");
			temp=temp.getNext();
		}
	}

	public boolean deletebypos(int pos) {
		if (pos <= 0 || (head == null && pos > 1))
			return false;

		if (pos == 1) {
			head = head.getNext();
			if (head != null) {
				head.setPrev(null);
			}
			return true;
		}

		node temp = head;
		for (int i = 1; i < pos; i++) {
			temp=temp.getNext();
			if(temp==null)
				return false;
		}
		
		node prev=temp.getPrev();
		node next=temp.getNext();
		prev.setNext(next);
		if(next!=null)
			next.setPrev(prev);
		return true;
	}

	
}
