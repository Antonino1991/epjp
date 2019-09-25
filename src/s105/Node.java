package s105;

public class Node {
	private int value;
	private Node next;

	public Node(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", next=" + next + "]";
	}

}
