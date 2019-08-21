import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortTest {
	private int[] get100RandomInts() {
		int [] a = new int[100];

		for ( int i = 0; i < 100; i++) {
			a[i] = (int) (Math.random() * 100);
		}
		return a;
	}

	private String[] getNames() throws IOException {
		// replace it with your own path
		String fileName = "/Users/mcflu/IdeaProjects/Info2Uebung01/src/names.txt";

		FileInputStream fis = new FileInputStream(fileName);
		String text = new Scanner(fis).useDelimiter("\\A").next();
		String[] names = text.split(" ");
		System.out.println(Arrays.toString(names));
		return names;
	}

	private void testSortInt() {
		int a[] = get100RandomInts();

		System.out.println("Original int array");
		System.out.println(Arrays.toString(a));

		SelectionSort sort = new SelectionSort();
		sort.sortInt(a);

		System.out.println("Sorted int array");
		System.out.println(Arrays.toString(a));
	}

	private void testSortString(String[] a) {
		System.out.println("Original String array");
		System.out.println(Arrays.toString(a));

		SelectionSort sort = new SelectionSort();
		sort.sortString(a);

		System.out.println("Sorted String array");
		System.out.println(Arrays.toString(a));

		System.out.println("The 938th name is " + a[937]);

		//my code
		int[] nums = sort.addStringNums(a);
		System.out.println("result: " + sort.euler22(nums));
	}

	public static void main(String[] args) throws IOException {
		SelectionSortTest sortingTest = new SelectionSortTest();

		sortingTest.testSortInt();

		 String[] a = sortingTest.getNames();
		 sortingTest.testSortString(a);
	}
}