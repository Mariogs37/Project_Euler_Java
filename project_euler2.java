//find sum of all even-valued terms in fibonacci sequence that are less than 4,000,000

//create function that takes two terms of fibonacci sequence and generates next term

//loop through all fibonacci numbers less than 4,000,000
	//check if divisible by two
		//if yes, add to total

class project_euler2 {

	public static int total = 0, first = 0, second = 1;
	public static final int LIMIT = 4000000;

	public static int nextFibonacci(int first, int second) {
		int next = first + second;
		return next;
	}

	public static boolean divisibleByTwo(int number) {
		return (number % 2) == 0 ? true : false;
	}

	public static void main(String[] args) {
		int next_number = nextFibonacci(first, second);
		while (next_number < LIMIT) {
			if (divisibleByTwo(next_number)) {
				total += next_number;
			}
			first = second;
			second = next_number;
			next_number = nextFibonacci(first, second);
		}
		System.out.println(total);
	}
}