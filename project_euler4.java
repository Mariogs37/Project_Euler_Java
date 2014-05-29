//Find the largest palindrome made from the product of two 3-digit numbers.

class project_euler4 {
	public static int largest_palindrome = 0;

	public static boolean isPalindrome(int number) {
		String original = Integer.toString(number);
		String reversed = new StringBuffer(original).reverse().toString();
		return (original.equals(reversed)) ? true : false;
	}

	public static void main(String[] args) {
		for (int i = 999; i >= 100; i--) {
			for (int j = 999; j >= 100; j--) {
				int candidate = i * j;
				if (isPalindrome(candidate) && candidate > largest_palindrome) {
					largest_palindrome = candidate;
					break;
				}
			}
		}
		System.out.println("The largest palindrome made from the product of 2 3-digit numbers is " + largest_palindrome);
	}
}