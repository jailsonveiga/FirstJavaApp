// Name Greeting

public class Greeting {

    public static void main(String[] args) {
       System.out.println("Name Greeting! " + helloName("Gerald"));

       System.out.println("Name greeting! " + helloName("Tiffany"));

       System.out.println("Name Greeting! " + helloName("Ed"));
    }
    public static String helloName(String name) {

        String greeting = "Hello";
        char charStr  = '!';
        return greeting + " " + name + charStr;
    }
}
