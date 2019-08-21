public class Union {

	public static int[] mergeTwoArrays( int[] a, int[] b){ //falscher Ansatz

		int[] c = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++){
			c[i] = a[i];
		}
		for (int j = 0; j < b.length; j++){
			c[j+ a.length] = b[j];
		}
		return c;
	}

	public static void mergeSort ( int [] a , int lo , int hi ) {
		 if ( hi <= lo ) {
			 return ;
			 }
		int mid = ( hi + lo ) / 2;
		mergeSort (a , lo , mid ) ;
		mergeSort (a , mid +1 , hi ) ;
		merge (a , lo , mid , hi ) ;
		}


	public static void merge ( int [] a , int lo , int mid , int hi ) {
		int[] aux = new int[a.length];
		for (int jack = lo; jack <= hi; jack++) {
			aux[jack] = a[jack];
		}
		int king = lo;
		int queen = mid + 1;
		for (int jack = lo; jack <= hi; jack++) {
			if (king > mid) {
				a[jack] = aux[queen];
				queen++;
			} else if (queen > hi) {
				a[jack] = aux[king];
				king++;
			} else if (aux[king] <= aux[queen]) {
				a[jack] = aux[king];
				king++;
			} else {
				a[jack] = aux[queen];
				queen++;
			}
		}
	}

/*1) Use two index variables i and j, initial values i = 0, j = 0
2) If arr1[i] is smaller than arr2[j] then print arr1[i] and increment i.
3) If arr1[i] is greater than arr2[j] then print arr2[j] and increment j.
4) If both are same then print any of them and increment both i and j.
5) Print remaining elements of the larger array.*/

public static int[] union( int[] a, int b []){
	int c[] = new int[a.length + b.length];
	int i = 0;
	int j = 0;
	int k = 0;
		while (i < a.length && j < b.length && k < c.length) {
			if (a[i] < b[j]) {
				//System.out.println(a[i]);
				c[k] = a[i];
				i++;
				k++;
			} else if (a[i] > b[j]) {
				//System.out.println(b[j]);
				c[k] = b[j];
				j++;
				k++;
			} else if (a[i] == b[j]) {
				//System.out.println (b[j]);
				c[k] = b[j];
				i++;
				j++;
				k++;
			}
		}
		//print out last element of array
		if (i < a.length) {
			//System.out.println(a[i++]);
			c[k] = a[i++];
		} else if (j < b.length) {
			//System.out.println(b[j++]);
			c[k] = a[j++];
		}

	return c;
}

public static int[] andNot( int[] a, int[] b){
		int[] c = new int[a.length + b.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < a.length && j < b.length && k < c.length) {
			if (a[i] < b[j]) {
				System.out.println("a: "+a[i]);
				c[k] = a[i];
				i++;
				k++;
			} else if (a[i] > b[j]) {
				System.out.println("b: "+b[j]);
				//c[k] = b[j];
				j++;
				//k++;
			} else if (a[i] == b[j]) {
				j++;
				i++; // einfach eine Stelle weiter gehen. Das c-Array wartet immer noch auf seine Befüllung
			}
		}
		//print out last element of array
		if (i < a.length) {
			//System.out.println(a[i++]);
			c[k] = a[i];
		} else if (j < b.length) {
			//System.out.println(b[j++]);
			c[k] = b[j];
		}

		return c;
	}


	public static void main(String[] args) {

		int [] d = {1,3,4,6,7,10,12};
		int[] e = {2,3,4,7,12};

		//int[] unionResult = union(d,e);
		int[] andNotResult = andNot(d,e);

		/*for(int i = 0; i < unionResult.length; i++){
			System.out.println("u[" + i + "]:" + unionResult[i]);
		}*/
		for(int i = 0; i < andNotResult.length; i++) {
			System.out.println("an[" + i + "]:" + andNotResult[i]);
		}

		//int[] a = {1, 12, 180, 4, 40};
		//int[] b = {8, 66, 10, 29};

		//int [] n = mergeTwoArrays(a,b);

		//mergeSort(n, 0, n.length-1);

		/*for(int i = 0; i < n.length; i++){
			System.out.println("n[" + i + "]:" + n[i]);
		}*/


	}
}