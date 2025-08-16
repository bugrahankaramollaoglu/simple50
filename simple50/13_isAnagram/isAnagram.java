/* isAnagram sorusunda birkac geleneksel yol vardır
 * birincisi iki stringide char arraye çevirip 
 * sıralayıp karşılaştırmak ama O(n logn) alır (sorting's complexity)
 * ikincisi hashMap kullanmak O(n) alır. çok daha optimizedir.
 * 
 */

import java.util.HashMap;

public class isAnagram {

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        // map.get('a') o map'te a'dan kaç tane varsa onu döndürür

        for (char c: s1.toCharArray()) {
            int count = 0;
            if (map.containsKey(c)) {
                count = map.get(c);
            }
            map.put(c, count + 1);
        }

        for (char c: s2.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("aaa", "1234"));
    }

}
