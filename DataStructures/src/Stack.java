import java.util.EmptyStackException;

public class Stack {

	private Node first;

	public void push(String s) {
		Node node = new Node(s);
		if (first != null) {
			node.next = first;
		}
		first = node;
	}

	public String pop() {
		if (first == null) {
			throw new EmptyStackException();
		}
		Node node = first;
		first = first.next;
		node.next = null;
		return node.value;
	}

	public static void main(String[] args) {
		Stack stack = new Stack();

		stack.push("A");
		stack.push("B");
		stack.push("C");
		String c = stack.pop();
		String b = stack.pop();
		String a = stack.pop();

	}
}


