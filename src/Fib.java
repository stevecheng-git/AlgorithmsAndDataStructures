public class Fib {

	public static long[] fib = new long[1000000000];

	public static long[][] mod = new long[30][];

	private static int lastDigitOfSumOfSquares(int n) {
		int[] fib = new int[] {0, 1};
		int sum = 1;
		for (int i = 2; i <= n; i++) {
			fib[i%2] = (fib[0] + fib[1]) % 10;
			sum += Math.pow(fib[i%2], 2);
			sum %= 10;
		}

		return sum;
	}

	private static int lastDigitOfPartialSum(int m, int n) {
		int[] fib = new int[] {0, 1};
		int sum = 1;
		int partial = 0;
		for (int i = 2; i <= n; i++) {
			fib[i%2] = (fib[0] + fib[1]) % 10;
			sum += fib[i%2];
			sum %= 10;

			if (i >= m) {
				partial += fib[i%2];
				partial %= 10;
			}
		}

		return partial;
	}

	private static int lastDigitOfSum(int n) {
		int[] fib = new int[] {0, 1};
		int sum = 1;
		for (int i = 2; i <= n; i++) {
			fib[i%2] = (fib[0] + fib[1]) % 10;
			sum += fib[i%2];
			sum %= 10;
		}

		return sum;
	}

	private static long fib(int n) {

		int[] fib = new int[] {0, 1};
		for (int i = 2; i < n; i++) {
			fib[i%2] = fib[0] + fib[1];
		}
		fib[0] = 0;
		fib[1] = 1;
		return fib[0] + fib[1];
	}

	private static long fib1(int n) {

		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < n; i++) {
			fib[i] = fib[i-1] + fib[i-2];

		}
		return fib[n-1] + fib[n-2];
	}

	private static long fib(int n, int m) {
		return fib[n] % m;
	}

	public static void main(String[] args) {
		long lStart = System.currentTimeMillis();
//		System.out.println(fibSumLastDigit(10001));
//		System.out.println(lastDigitOfPartialSum(10,200));
		System.out.println(lastDigitOfSumOfSquares(7));

		long lEnd = System.currentTimeMillis();
		System.out.println((lEnd-lStart));
	}

	public static void main2(String[] args) {
		for (int i = 0; i < mod.length; i++) {
			mod[i] = new long[100];
		}

		fib1(80);

		for (int i = 2; i < 30; i++) {
			System.out.print("mod " + i + ": ");
			for (int j = 0; j < 80; j++) {
				mod[i][j] = fib[j] % i;
				System.out.print(fib[j] % i + ",");
			}
			System.out.println();

		}

		for (int i = 2; i < 30; i++) {
			for (int k = 3; k < 80; k++) {
				if (mod[i][k] == 0 && mod[i][k+1] == 1 && mod[i][k+2] == 1) {
					System.out.println("mod " + i + " interval: " + k);
					break;
				}
			}
		}
	}
}
