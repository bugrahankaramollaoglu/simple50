import java.util.Set;

public class RemoveDuplicatesString {
    public static String removeDuplicateString(String s) {
        if (s == null) return null;

        Set<Character> seen = new LinkedHashSet<>();   // LinkedHashSet sıralamayı korur
        for (char ch : s.toCharArray()) {
            seen.add(ch);
        }

        // hashseti stringe direkt çeviremiyosun. stringBuilder'a oradan stringe ancak.
        StringBuilder result = new StringBuilder(seen.size());
        for (char ch : seen) {
            result.append(ch);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicateString("abracadabra")); 
    }
}