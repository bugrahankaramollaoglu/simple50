// reverse a string

class reverseStr {
	public static String myReverseStr(String str) {
		if (str == null || str.isBlank())
			return "invalid input";

		return new StringBuilder(str).reverse().toString();
	}

	public static void main(String[] args) {
		System.out.println(myReverseStr(""));
		System.out.println(myReverseStr("bugra"));
	}
}

// time -> o(n)
// space -> o(n) bc it all takes as the len(str)
