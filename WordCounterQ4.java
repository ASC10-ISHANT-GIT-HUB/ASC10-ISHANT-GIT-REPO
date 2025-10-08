public class WordCounterQ4 {
    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) return 0;
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String input = "Sum of 12 and 20 is 32";
        System.out.println("Word Count: " + countWords(input));
    }
}