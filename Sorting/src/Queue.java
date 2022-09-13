public class Queue {
	private Node head;
	private Node tail;

	public void enqueue(String s) {
		Node node = new Node(s);
		if (head == null) {
			// If there are no elements, set head and tail
			head = node;
			tail = node;
		} else {
			// Otherwise, append to the tail of the queue
			tail.next = node;
			tail = node;
		}

	}

	public String dequeue() {
		if (head == null) {
			throw new NullPointerException(); // Some exception when there is no element
		}
		Node node = head; // Returning the head

		head = head.next; // Reset head to the next element
		if (head == null) {
			// If there are no more elements, then tail must also be null
			tail = null;
		}
		node.next = null; // Sever the link to next

		return node.value;
	}
}
