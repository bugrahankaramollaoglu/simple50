public class Swap {
	public static void swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a now: " + a + " b now: " + b);
	}

	public static void swap2(int a, int b) {
		a ^= b;
		b ^= a;
		a ^= b;
		System.out.println("a now: " + a + " b now: " + b);
	}

	public static void main(String[] args) {
		swap(5, 7);
		swap2(5, 7);
	}
}
