public class CapitalizeString {

    public static String capitalizeString(String s) {

        if (s != null && !s.isEmpty()) {
            return s.substring(0, 1).toUpperCase() + s.substring(1);
        }
        return "HATA";

    }
    public static void main(String[] args) {
        System.out.println(capitalizeString("bugra"));
    }
}