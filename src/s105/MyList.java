package s105;

public class MyList {
	Node head;

	public void add(int value) {

		Node newnode = new Node(value);

		if (head == null) {
			head = newnode;
			return;

		}
		Node cur = head;
		Node next = cur.getNext();
		while (next != null) {
			cur = next;

		}
		cur.setNext(newnode);
	}

	public void popTail() {
		Node cur = head;
		Node next = cur.getNext();
		while (next == null) {
			cur = next;

		}

	}

	public int size() {
		int result = 0;
		Node cur = head;
		while (cur != null) {
			result++;
			cur = cur.getNext();
		}

		return result;
	}

	public int get(int index) {
		int value = 0;
		int ind = 0;
		Node cur = head;
		while (cur != null) {
			if (ind <= index) {
				value = cur.getValue();
				cur = cur.getNext();
				ind++;
			}
		}
		return value;
	}

	@Override
	public String toString() {
		return "Mylist [head=" + head + "]";
	}

}