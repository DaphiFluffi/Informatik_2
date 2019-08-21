public class SelectionSort {

	private void swap(int[] a, int i, int j)  {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public void sortInt(int[] a)  {
		for (int i = 0; i < a.length - 1; i++) {
			int j = i;
			for (int q = i + 1; q < a.length; q++) {
				if (a[j] > a[q]) {
					j = q;
				}
			}
			swap(a, i, j);
		}
	}

	public void sortString(String[] a) {
		// your code goes here
		for (int i = 0; i < a.length - 1; i++) {
			int j = i;
			for (int q = i + 1; q < a.length; q++) {
				if (a[j].compareTo(a[q]) > 0) {
					j = q;
				}
			}
			String temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}


	public static int[] addStringNums(String[] c) {
		//int sum = 0;
		int[] sums = new int[c.length];
		for(int i = 0; i < c.length; i++){
			int sum = 0;
			for (int j = 0; j < c[i].length(); j++){

				sum = sum + (int)(c[i].charAt(j))-64;

			}
			//System.out.println(sum);
			sums[i] = sum;
			//System.out.println(sums[i]);
		}
		return sums;
	}

	public static int euler22 (int[] d) {

		int sum = 0;
		for(int i = 0; i < d.length; i++) {
			sum = sum + ((i + 1)* d[i]);
		}
		return sum;
	}

}

