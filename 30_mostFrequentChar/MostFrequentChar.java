import java.util.Map;
import java.util.LinkedHashMap;

public class MostFrequentChar {

	public static char mostFrequentChar(String s) {

		if (s == null || s.isBlank()) return ' ';

		Map<Character, Integer> letters = new LinkedHashMap<Character, Integer>();

		for (char ch : s.toCharArray()) {
			letters.put(ch, letters.getOrDefault(ch, 0) + 1);
		}

		char mostFrequentChar = '\0';
		int maxKount = 0;

		for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
			if (entry.getValue() > maxKount) {
				maxKount = entry.getValue();
				mostFrequentChar = entry.getKey();
			}
		}

		return mostFrequentChar;

	}

	public static void main(String[] args) {
		System.out.println(mostFrequentChar(""));
		System.out.println(mostFrequentChar("bugra"));
		System.out.println(mostFrequentChar("hello"));
		System.out.println(mostFrequentChar("programming"));

	}

}
