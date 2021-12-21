//Convert Minutes into Seconds

public class mintosec {
    public static void main(String[] args) {

        System.out.println("Convert" + " " + "6 minutes into Seconds:" + " " + convert(6) + " " + "Seconds");

        System.out.println("Convert" + " " + "15 minutes into Seconds:" + " " + convert(15) + " " + "Seconds");

        System.out.println("Convert" + " " + "1 minutes into Seconds:" + " " + convert(1) + " " + "Seconds");
    }
    public static int convert(int minutes) {
        return minutes * 60;
    }
}
