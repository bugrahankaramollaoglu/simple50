public class CountWords {

    public static int countWords(String str) {
        if (str == null || str.isBlank()) return 0;

        int kelimeSayisi = 0;
        int i = 0;

        while (i < str.length()) {
            while (i < str.length() && str.charAt(i) == ' ') {
                i++;
            }

            if (i < str.length() && str.charAt(i) != ' ') {
                kelimeSayisi++;
                while (i < str.length() && str.charAt(i) != ' ') {
                    i++;
                }
            }
        }

        return kelimeSayisi;
    }

    public static void main(String[] args) {
        System.out.println(countWords("   bugra   kara    molla   ")); // 3
        System.out.println(countWords("singleWord")); // 1
        System.out.println(countWords("   ")); // 0
        System.out.println(countWords(null)); // 0
    }
}
