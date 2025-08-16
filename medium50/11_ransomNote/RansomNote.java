import java.util.HashMap;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineMap = new HashMap<>();

        for (char c : magazine.toCharArray()){
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!magazineMap.containsKey(c) || magazineMap.get(c) == 0) return false;
            magazineMap.put(c, magazineMap.get(c) - 1);
        }
        return true;
    }
	public static void main(String[] args) {
		System.out.println(canConstruct("aab", "abb"));
		System.out.println(canConstruct("ab", "ba"));
		System.out.println(canConstruct("aabcc", "abc"));
		System.out.println(canConstruct("abc", "aabcc"));
	}
}
