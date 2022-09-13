import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a = new int[] {1, 2, 3, 4, 5};
		int[] b = new int[] {5, 4, 3, 2, 1};
		int[] c = new int[] {4,3,2,10,12,1,5,6};

//		Arrays.stream(sort(a)).forEach(System.out::println);
//		Arrays.stream(sort(b)).forEach(System.out::println);
		Arrays.stream(sort(c)).forEach(System.out::println);
	}

	private static int[] sort(int[] arr)
	{
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		return arr;
	}
}
