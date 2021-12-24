// Reverse the Order of a String

public class ReverseOrder {

    public static void main(String[] args) {
        System.out.println("Reverse String (Hello World) - " + reverse("Hello World"));

        System.out.println("Reverse String (The quick brown fox.) - " + reverse("The quick brown fox."));
    }

    public static String reverse(final String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
