// Reverse The Number

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Reverse (5121) - " + rev(5121));

        System.out.println("Reverse (69) - " +rev(69));

        System.out.println("Reverse (-122157) - " +rev(-122157));
    }
    public static String rev(int n) {
       return new StringBuilder(Math.abs(n) + "").reverse().toString();
    }
}
