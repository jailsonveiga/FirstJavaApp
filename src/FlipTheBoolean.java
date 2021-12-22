//Flip the Boolean

public class FlipTheBoolean {
    public static void main(String[] args) {

        System.out.println("Flip the Boolean (true) to: " + reverse(true));
        System.out.println("Flip the Boolean (false) to: " + reverse(false));

    }
    public static boolean reverse(boolean b) {
        return !b;
    }
}
