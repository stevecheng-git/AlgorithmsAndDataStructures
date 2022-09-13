import java.util.Arrays;

public class QuickSortAbdul {

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static int partition(int[] arr, int l, int h) {
		int pivot = arr[l];
		int i = l;
		int j = h;
		while (i < j) {
			do {
				i++;
			} while (i < arr.length && arr[i] < pivot);
			do {
				j--;
			} while (j >= 0 && arr[j] > pivot);
			if (i < j) {
				swap(arr, i, j);
			}
		}
		swap(arr, l, j);
		return j;
	}

	private static int[] sort(int[] arr, int l, int h) {
		if (l < h) {
			int j = partition(arr, l, h);
			sort(arr, l, j);
			sort(arr, j+1, h);
		}
		return arr;
	}

	private static int[] sort(int[] arr) {
		return sort(arr, 0, arr.length);
	}

	public static void main(String[] args) {
		int[] a = new int[] {1, 2, 3, 4, 5};
		int[] b = new int[] {5, 4, 3, 2, 1};
		int[] c = new int[] {4,3,2,10,12,1,5,6};

//		Arrays.stream(sort(a)).forEach(System.out::println);
//		Arrays.stream(sort(b)).forEach(System.out::println);
		Arrays.stream(sort(c)).forEach(System.out::println);
	}
}
