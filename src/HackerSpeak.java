public class HackerSpeak {
    public static void main(String[] args) {
        System.out.println("Returns coded version of the string: (java is cool) " + hackerSpeak("java is cool"));
        System.out.println("Returns coded version of the string: (programing is fun) " + hackerSpeak("programing is fun"));
        System.out.println("Returns coded version of the string: (become a coder) " + hackerSpeak("become a coder"));
    }
    public static String hackerSpeak(String str) {
        return str.replace("a", "4").replace("e", "3").replace("i", "1").replace("o", "0").replace("s", "5");
    }
}
