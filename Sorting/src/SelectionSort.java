import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = new int[] {1, 2, 3, 4, 5};
		int[] b = new int[] {5, 4, 3, 2, 1};
		int[] c = new int[] {4,3,2,10,12,1,5,6};

//		Arrays.stream(sort(a)).forEach(System.out::println);
//		Arrays.stream(sort(b)).forEach(System.out::println);
		Arrays.stream(sort(c)).forEach(System.out::println);
	}

	private static int[] sort(int arr[])
	{
		int n = arr.length;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n-1; i++)
		{
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i+1; j < n; j++) {
				if (arr[j] < arr[min_idx]) {
					min_idx = j;
				}
			}

			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
}

