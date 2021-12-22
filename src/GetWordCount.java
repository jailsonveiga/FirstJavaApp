// Get Word Count

public class GetWordCount {
    public static void main(String[] args) {
        System.out.println("Count The Words in a String (I'am so poud of my coding skills): " + countWords("I'am so proud of my coding skills") + " words total");

        System.out.println("Count The Words in a String (Coding With Jay): " + countWords("Coding With Jay") + " words total");
    }
    public static int countWords(String s) {
        return s.split(" ").length;
    }
}
