import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NearlySimilarRectangles {

	// gcd niye lazim? çünkü 4/8 ile 1/2'yi ayrı ayrı karşılaştırmak istemezsin.
	// o yüzden her türlü en küçük katsayılı ratio'yu bulup onu mapte saklıyoruz
	public static long gcd(long a, long b) {
		while (b != 0) {
			long tmp = b;
			b = a % b;
			a = tmp;
		}
		return a;
	}

	public static long nearlySimilarRectangles(int n, List<List<Long>> sides) {

		// create a ratioCount
		Map<String, Long> ratioCount = new HashMap<>();

		for (List<Long> rect : sides) {

			long w = rect.get(0);
			long h = rect.get(1);
			long g = gcd(w, h);

			long normalizedWidth = w / g;
			long normalizedHeight = h / g;

			// ratiolari mapte tutuyoruz
			String key = normalizedWidth + "/" + normalizedHeight;
			ratioCount.put(key, ratioCount.getOrDefault(key, 0L) + 1);

		}

		// count pairs
		long totalPairs = 0;
		for (long count : ratioCount.values()) {
			totalPairs += (count * (count - 1)) / 2;
		}

		return totalPairs;

	}

	public static void main(String[] args) {
		List<List<Long>> sides = new ArrayList<>();
		sides.add(Arrays.asList(4L, 8L));
		sides.add(Arrays.asList(15L, 30L));
		sides.add(Arrays.asList(25L, 50L));

		long result = nearlySimilarRectangles(3, sides);
		System.out.println("Nearly Similar Rectangles: " + result); // Expected: 3
	}
}
