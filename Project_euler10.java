//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

//Find the sum of all the primes below two million.

public class Project_euler10 {

	public static final int LIMIT = 2000000;

	public static boolean isPrime(int number) {
		boolean isPrime = true;
		double square_root = Math.sqrt(number);
		if (number == 2) {
			return isPrime;
		}
		for (int i = 2; i <= square_root; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		long total = 0;
		for (int i = 2; i < LIMIT; i++) {
			if (isPrime(i)) {
				total += i;
			}
		}

		System.out.println("The sum of all primes below two million is " + total);

	}
}