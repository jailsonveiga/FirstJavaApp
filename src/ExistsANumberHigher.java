//Exists a Number Higher

public class ExistsANumberHigher {
    public static void main(String[] args) {
        System.out.println("Exists at least one number (5, 3, 15, 22, 4) that is larger or equal to (10) " + existsHigher(new int[] {5, 3, 15, 22, 4},10) + " -> (15, 22)");
        System.out.println("Exists at least one number (1, 2, 3, 4, 5) that is larger or equal to (8) " + existsHigher(new int[] {1, 2, 3, 4, 5},8) + " -> (No)") ;

    }
    public static boolean existsHigher(int[] arr, int n) {
        for (int j : arr) {
            if (j >= n) return true;
        }
        return false;
    }
}
