import java.util.EmptyStackException;

public class StackArray {

	// index of the last element pushed
	private int topOfStack = -1; // an empty stack
	private String[] array = new String[1];

	public void push(String s) {
		ensureEncapacity();
		array[++topOfStack] = s;
	}

	private void ensureEncapacity() {
		if (topOfStack == array.length - 1) {
			String[] newArray = new String[array.length * 2];
			System.arraycopy(array, 0, newArray, 0, array.length);
			array = newArray;
		}
	}

	public String pop() {
		if (topOfStack < 0) {
			throw new EmptyStackException();
		}
		String value = array[topOfStack];
		topOfStack--;
		return value;
	}

	public static void main(String[] args) {
		StackArray stack = new StackArray();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		String c = stack.pop();
		String b = stack.pop();
		String a = stack.pop();

	}
}


