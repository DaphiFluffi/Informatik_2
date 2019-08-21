public class SelectionSortIch {

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}
	public static int[] selectionSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int j = i;
			for (int q = i + 1; q < a.length; q++) {
				if (a[j] > a[q]) {
					j = q;
				}
			}
			swap(a, i, j);
		}
		return a;
	}

	public static void printErg(int[] b) {
		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}
	}

	public static void main(String[] args) {

		int[] test = {2, 4, 9, 0, 8, 30};
		int[] b = selectionSort(test);
		printErg(b);
	}
}
