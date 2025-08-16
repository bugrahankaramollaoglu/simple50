public class ToggleCase {

    public static String toggleCase (String s) {
        StringBuilder ss = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                ss.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                ss.append(Character.toUpperCase(ch));
            } else {
                ss.append(ch);  
            }
        }

        return ss.toString();
    }
}