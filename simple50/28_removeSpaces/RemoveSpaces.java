public class RemoveSpaces {
    public static String removeSpaces(String s) {
        if (s == null || s.isBlank()) return "";
        return s.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        System.out.println(removeSpaces("    BuGRA   "));
        System.out.println(removeSpaces("     merhaba     her   ke s e "));
    }
}
