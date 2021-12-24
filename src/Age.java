// Convert age to days

public class Age {

    public static void main(String[] args) {
        System.out.println("Convert age to days? (65 in age) will be " + calAge(65) + " in days.");

        System.out.println("Convert age to days? (0 in age) will be " + calAge(0) + " in days.");

        System.out.println("Convert age to days? (20 in age) will be " + calAge(20) + " in days.");
    }
    public static int calAge(int age) {
        int days = 365;
        return age * days;
    }
}
