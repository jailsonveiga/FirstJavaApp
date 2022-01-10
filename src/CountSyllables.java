public class CountSyllables {
    public static void main(String[] args) {
        System.out.println("Count the number of syllables: (buf-fet) - " + numberSyllables("buf-fet"));
        System.out.println("Count the number of syllables: (beau-ti-ful) - " + numberSyllables("beau-ti-ful"));
        System.out.println("Count the number of syllables: (mon-u-men-tal) - " + numberSyllables("mon-u-men-tal"));
    }

    public static int numberSyllables(String word) {
        return word.split("-").length;
    }
}
