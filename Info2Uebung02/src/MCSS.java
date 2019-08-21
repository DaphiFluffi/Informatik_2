 class MCSSResult {
	 public int sum;
	 public int start;
	 public int end;

	 public String toString() {
		 return "sum: " + sum + " start: " + start + " end: " + end;
	 }


	 public static MCSSResult mcss1(int[] a) {
		 int sum = 0;
		 int start = -1;
		 int end = -1;

		 for (int i = 0; i < a.length; i++) {
		 	//System.out.println("i:" + i );
			 for (int j = i; j < a.length; j++) {
				// System.out.println("j1:" + j +" i2:" +i);
				 int thisSum = 0;
				 for (int k = i; k <= j; k++) {
					 //System.out.println("k1:" + k +" j2:" + j + " i3:" + i);
					 thisSum += a[k];
					 if (thisSum > sum) {
						 sum = thisSum;
						 start = i;
						 end = j;
						 //System.out.println("sum1:" + sum + " start1:" + start + " end1:" + end);
					 }
				 }
			 }
		 }
		 MCSSResult res = new MCSSResult();
		 res.sum = sum;
		 res.start = start;
		 res.end = end;
		 return res;
	 }

	 public static MCSSResult mcss2(int[] a){
		  int sum = 0;
		  int start = -1;
		  int end = -1;

		  for (int i = 0; i< a.length; i++) {
			  int thisSum = 0;
			  for (int j = i; j< a.length; j++) {
				  thisSum += a[j];
				  if (thisSum > sum){
					  sum = thisSum;
					  start = i;
					  end = j;
				  }
			  }
		  }
		 MCSSResult res = new MCSSResult();
		  res.sum = sum;
		  res.start = start;
		  res.end = end;
		  return res;
	 }

	 public static MCSSResult mcss3(int[] a){
		  int sum = 0;
		  int thisSum = 0;
		  int start = -1;
		  int end = -1;
		  int i = 0;
		  for (int j = 0; j < a.length; j++) {
			  thisSum += a[j];
			  if (thisSum > sum){
				  sum = thisSum;
				  start = i;
				  end = j;
				  } else if (thisSum < 0) {
				  i = j + 1;
				  thisSum = 0;
				  }
			  }
		 MCSSResult res = new MCSSResult();
		  res.sum = sum;
		  res.start = start;
		  res.end = end;
		  return res;
		  }

	 public static int[] generateNumbers(int n) {
		 // define the range
		 int max = 1000;
		 int min = -1000;
		 int range = max - min + 1;
		 int[] randomNumbers = new int[n];
		 // generate random numbers within 1 to n
		 for (int i = 0; i < n; i++) {
			 int rand = (int) (Math.random() * range) + min;
			 randomNumbers[i]= rand;
		 }
		 return randomNumbers;
	 }
	 public static void main(String[] args) {

		 /*int[] a = {-2, 11, -4, 13, -5, 2};
		 System.out.println(mcss1(a));
		 int[] b = {1, -3, 4, -2, -1, 6};
		 System.out.println(mcss1(b));*/
		 int [] p = generateNumbers(100000);

		 //System.out.println(mcss1(p));
		 System.out.println(mcss2(p));
		 //System.out.println(mcss3(p));

		/* for (int i =0; i <p.length; i++){ //test generateNumbers
		 	System.out.println(p[i]);
		 }*/
		 System.out.println("Time:" + System.currentTimeMillis() + " seconds");

	 }
 }