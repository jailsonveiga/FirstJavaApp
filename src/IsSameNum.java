// Are the numbers equal

public class IsSameNum {

    public static void main(String[] args) {
        System.out.println("Are the numbers equal? (5, 5) " + isSameNum(5, 5) + " - The numbers is equal");

        System.out.println("Are the numbers equal? (8, 5) " + isSameNum(8, 5) + " - The numbers is not equal");
    }

    public static boolean isSameNum(int x, int y) {
        return x == y;
    }
}
