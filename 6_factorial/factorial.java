// find factorial of a given number

public class factorial {
	public static long myFactorial(int n) {
		if (n < 0)
			return -1;
		if (n <= 1)
			return 1;
		int result = 1;
		// bc multiplying by one is ineffective
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	public static long myRecursiveFactorial(int n) {
		if (n < 0)
			return -1;
		if (n <= 1) {
			return 1;
		} else {
			return n * myRecursiveFactorial(n - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(myRecursiveFactorial(0)); // 1
		System.out.println(myRecursiveFactorial(1)); // 1
		System.out.println(myRecursiveFactorial(2)); // 2
		System.out.println(myRecursiveFactorial(3)); // 6
		System.out.println(myRecursiveFactorial(5)); // 120
	}
}

// time: o(n)
// space: o(1)
