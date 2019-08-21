public class CountRight {

	public static int countRight(int[] myNumbers, int[] rightNumbers){

		int count = 0;

		for(int i =0; i < myNumbers.length; i++) {

			for(int k=0; k < rightNumbers.length; k++) {

				if (myNumbers[i] == rightNumbers[k]) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int[] x = {3, 9, 1, 6, 38, 40};
		int[] y = {5, 8, 3, 7, 10, 1};
		System.out.println("How many numbers are the same?: " + countRight(x, y));
	}
}
