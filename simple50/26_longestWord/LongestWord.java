// find the length of the longest word in a sentence

public class LongestWord {

    public static int longestWord(String s) {

        if (s == null || s.isBlank())
            return 0;

        int enUzunKelimeUzunlugu = 0;
        int mevcutKelimeUzunlugu = 0;

        int i = 0;

        // " bug bugra bugr " // 5

        while (i < s.length()) {
            while (i < s.length() && s.charAt(i) == ' ')
                i++;

            while (i < s.length() && s.charAt(i) != ' ') {
                mevcutKelimeUzunlugu++;
                i++;
            }
            if (mevcutKelimeUzunlugu > enUzunKelimeUzunlugu)
                enUzunKelimeUzunlugu = mevcutKelimeUzunlugu;
            mevcutKelimeUzunlugu = 0;
            i++;
        }

        return enUzunKelimeUzunlugu;
    }

    public static void main(String[] args) {
        System.out.println(longestWord("   bug   bugra    bugr   "));  // 5
        System.out.println(longestWord("hello world"));               // 5
        System.out.println(longestWord(""));                          // 0
        System.out.println(longestWord(null));                        // 0
    }
}