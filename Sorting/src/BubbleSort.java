import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = new int[] {1, 2, 3, 4, 5};
		int[] b = new int[] {5, 4, 3, 2, 1};
		int[] c = new int[] {4,3,2,10,12,1,5,6};

//		Arrays.stream(sort(a)).forEach(System.out::println);
//		Arrays.stream(sort(b)).forEach(System.out::println);
		Arrays.stream(sort(c)).forEach(System.out::println);
	}

	public static int[] sort(int[] arr) {
		boolean swapped = false;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				// swap
				if (arr[j] > arr[j+1]) {
					swapped = true;
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			if (!swapped) break;
		}
		return arr;
	}
}
