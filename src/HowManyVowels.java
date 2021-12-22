// How Many Vowels

public class HowManyVowels {
    public static void main(String[] args) {
        System.out.println("How Many Vowels? " + getCount("Celebration"));

        System.out.println("How Many Vowels? " + getCount("Palm"));

        System.out.println("How Many Vowels? " + getCount("Prediction"));
    }
    public static int getCount(String str) {
        return str.replaceAll("[^aeiouAEIOU]", "").length();
    }
}
