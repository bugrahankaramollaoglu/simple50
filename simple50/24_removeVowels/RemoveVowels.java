import java.util.Set;       // or: import java.util.*;

public class RemoveVowels {
    public static String removeVowels(String s) {

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        StringBuilder returnStr = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (!vowels.contains(ch)) {
                returnStr.append(ch);
            }
        }
        return returnStr.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeVowels("BUGra"));
    }
}