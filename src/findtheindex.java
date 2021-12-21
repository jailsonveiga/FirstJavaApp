// Find The Index

public class findtheindex {

    public static void main(String[] args) {
        System.out.println(findIndex(new String[]{"Adidas", "Nike", "Fils"}, "Nike"));

        System.out.println(findIndex(new String[]{"Adidas", "Nike", "Fils"},  "Adidas"));
    }
    public static int findIndex(String[] arr, String str) {
        return java.util.Arrays.asList(arr).indexOf(str);
    }
}
