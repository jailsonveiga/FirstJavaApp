//Return Something to Me!

public class returnsomething {
    public static void main(String[] args) {
        System.out.println(giveMeSomething("is cooking"));
        System.out.println(giveMeSomething("is running"));
        System.out.println(giveMeSomething("is better than nothing"));
    }
    public static String giveMeSomething(String a) {
        String someStr = "something";

        return someStr + " " + a;
    }
}
