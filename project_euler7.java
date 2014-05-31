//find 10,001st prime

class project_euler7 {

	public static final int LIMIT = 10001;

	public static boolean determineIfPrime(int candidate) {
		double root = Math.sqrt(candidate);
		boolean isPrime = true;

		if (candidate == 2) {
			return true;
		}

		for (int i = 2; i < root; i++) {
			if (candidate % i == 0) {
				isPrime = false;
				break;
			}
		}

		return isPrime;
	}

	public static void main(String[] args) {
		int count = 0, candidate = 2;
		while (count < LIMIT) {
			if (determineIfPrime(candidate)) {
				count++;
				if (count == LIMIT) {
					break;
				}
			}
			candidate++;
		}
		System.out.println("The 10,001st prime is " + candidate);

	}
}