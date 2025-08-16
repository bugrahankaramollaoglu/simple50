public class ReplaceCharacter {

    public static String replaceChar(String s, char oldChar, char newChar) {
        if (s == null) return null;
        return s.replace(oldChar, newChar);
    }

    public static void main(String[] args) {
        System.out.println(replaceChar("hello", 'l', 'x'));  // hexxo
        System.out.println(replaceChar("java", 'a', 'o'));   // jovo
        System.out.println(replaceChar("test", 't', 'p'));   // pesp
        System.out.println(replaceChar("abc", 'd', 'e'));    // abc
    }
}