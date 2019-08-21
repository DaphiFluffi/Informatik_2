public class FastCountRight {

	//condition: myNumbers and right numbers are sorted
	public static int fastCountRight(int[] myNumbers, int[] rightNumbers) {

		int count = 0;
		int i = 0;
		int j = 0;
		while( i != myNumbers.length) {

				if(myNumbers[i] > rightNumbers[j]){
					i++;
				}
				else if(myNumbers[i] == rightNumbers[j]) {
					count++;
					j++;
					i++;
				}else{
					j++;
				}
			}
		return count;
	}


	public static void main(String[] args) {
		int[] x = {1, 3, 6, 9, 38, 40};
		int[] b = {1, 3, 5, 7, 8, 10};
		System.out.println("How many numbers are the same?: " + fastCountRight(x, b));
	}

}