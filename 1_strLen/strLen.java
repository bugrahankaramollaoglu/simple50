// return length of a string

class strLen {

	public static int myStrLen(String str) {
		if (str == null || str.isBlank())
			return 0;
		return str.length();
	}

	public static void main(String[] args) {
		System.out.println(myStrLen(""));
		System.out.println(myStrLen("     "));
		System.out.println(myStrLen("bugrahan"));
	}
}

// time complexity -> o(1) bc In Java, the length of a string is stored internally as a
// field when the String object is created. So when you call .length(), you're
// not looping through characters — you're just accessing a precomputed integer.
// yani javada aslında bir string şöyle saklanır:
// public final class String {
//     private final byte[] value;
//     private final int length; // (or derived from value.length)
//     ...
//     public int length() {
//         return value.length; // or a cached field
//     }
// }

// space -> o(1) bc calling .length() does not allocate new memory
