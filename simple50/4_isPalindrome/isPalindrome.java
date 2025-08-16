// is a word palindrome? (madam, nursesrun)

class isPalindrome {

	// space O(n)
	public static boolean myIsPalindrome(String str) {
		if (str == null || str.isBlank())
			return false;

		return str.equals(new StringBuilder(str).reverse().toString());
	}

	// two pointer tekniği ile O(1) space (without creating extra data structure)

	public static boolean myIsPalindrome2(String str) {

		int left = 0, right = str.length()-1;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(myIsPalindrome(""));
		System.out.println(myIsPalindrome("     "));
		System.out.println(myIsPalindrome("madam"));
		System.out.println(myIsPalindrome("nursesrun"));
	}
}

// hepsinde time: O(n)
