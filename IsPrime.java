public class IsPrime {


	//O(1) im best Case, weil alles was gerade ist (also durch 2 teilbar ist), sofort von p=2 am anfang erkannt wird und sofort false returnt!!
	public static boolean isPrime (int n)
	{
		if (n <= 1){ //if n<=1 it can not be a prime number
			return false;
		}else{
			for (int p = 2 ; p <= Math.sqrt(n) ; p++){ //it is enough to search for numbers until the square root of n
				if (n % p == 0){ //if n can be divided by another number than 1 or itself it is not a prime number
					return false;
				}
			}
			return true; //if there is no number that n can be divided by it is a prime number
		}
	}

	public static void main(String[] args) {
		System.out.println("My number is a prime number: " + isPrime(10)); //assignment 1
	}
}
