//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

class project_euler5 {

	public static int answer;
	public static boolean answerFound = false;

	public static boolean candidateDivisibleBy(int candidate, int divisor) {
		return (candidate % divisor == 0);
	}

	public static boolean divisibleByAllTwenty(int candidate) {
		boolean divisible = false;
		for (int i = 2; i <= 20; i++) {
			if (!candidateDivisibleBy(candidate, i)) {
				break;
			}
			if (i == 20) {
				divisible = true;
				break;
			}
		}
		return divisible;
	}

	public static void main(String[] args) {
		int candidate = 20;
		while (answerFound == false) {
			if (divisibleByAllTwenty(candidate)) {
				answerFound = true;
			}
			candidate++;
		}
		System.out.println("The smallest positive number divisible by all numbers 1-20 is " + candidate);

	}
}