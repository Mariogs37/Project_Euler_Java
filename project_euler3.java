//find largest prime factor of 600851475143

class project_euler3 {

	public static final long BIG_NUM = 600851475143L;
	public static int biggest_prime_factor = 0;
	
	public static boolean isFactor(int divisor) {
		return (BIG_NUM % divisor == 0) ? true : false;
	}

	public static boolean isPrime(int number) {
		if (number == 2) {
			return true;
		}
		boolean isPrime = true;
		double square_root = Math.sqrt(number);
		for (int i = 3; i < square_root; i += 2) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		double square_root = Math.sqrt(BIG_NUM);
		for (int i = 2; i < square_root; i++) {
			if (isPrime(i) && isFactor(i)) {
				biggest_prime_factor = i;
			}
		}
		System.out.println("The biggest prime factor of " + BIG_NUM + " is " + biggest_prime_factor);
	}
}