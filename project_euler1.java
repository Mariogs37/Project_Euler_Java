//sum of all multiples of 3 or 5 below 1,000

class project_euler1 {
	public static void main(String[] args) {
		int sum_of_multiples = 0;
		for (int i = 0; i <1000; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				sum_of_multiples += i;
			}
		}
		System.out.println("Sum of multiples of 3 or 5 below 1,000 is " + sum_of_multiples);
	}
}