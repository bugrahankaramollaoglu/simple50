// concatenate two strings

class strCat {

	public static String myStrCat(String s1, String s2) {
		if (s1 == null || s2 == null || s1.isBlank() || s2.isBlank())
			return "invalid input";

		return s1 + s2;
	}

	public static void main(String[] args) {
		System.out.println(myStrCat("", ""));
		System.out.println(myStrCat("   ", "        "));
		System.out.println(myStrCat("bugra", "kara"));
	}
}

// time -> o(n+m)
// space -> o(n+m) bc it all takes as the len(str1) + len(str2)
