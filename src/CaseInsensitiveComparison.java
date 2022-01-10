public class CaseInsensitiveComparison {
    public static void main(String[] args) {
        System.out.println("Validates whether two strings are identical (insensitive) - (hello and hello) - " + match("hello", "hello"));
        System.out.println("Validate whether two strings are identical (insensitive) - (motive and emotive) - " + match("motive", "emotive"));
        System.out.println("Validate whether two strings are identical (insensitive) - (venom and VENOM) - " + match("venom", "VENOM"));
    }
    public static boolean match(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }
}
