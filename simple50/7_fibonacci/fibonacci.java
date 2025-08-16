// print the first n fibonacci


// time complexity: O(n) çünkü n kadar yazdiriyor
// space complexity: O(1) çünkü yeni ds yaratmiyoruz
//
public class fibonacci {
	// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
	public static void fibonacci(int n) {

		if (n <= 0)
			return;

		int a = 1, b = 1;
		System.out.print(a);
		if (n > 1) {System.out.print(", " + b);}

		for (int i = 3; i <= n; i++) {
			int toplam = a+ b;
			System.out.print(", " + toplam);
			a = b;
			b = toplam;
		}
		System.out.println();
	}

	public static void nthFib(int n) {
		if (n <= 0) return;
		if (n == 1) {
			System.out.println(n + ". sayi: 1");
			return ;
		}

		if (n == 2) {
			System.out.println(n + ". sayi: 2");
			return;
		}

		int nth = 0, a = 1, b = 1;
		for (int i = 3; i <= n; i++) {
			nth = a + b;
			a = b;
			b = nth;
		}
		System.out.println(n + ". sayi: " + nth);
	}

	public static void main(String[] args) {
		//fibonacci(7);
		nthFib(1);
		nthFib(2);
		nthFib(3);
		nthFib(4);
		nthFib(5);
		nthFib(6);
	}
}
