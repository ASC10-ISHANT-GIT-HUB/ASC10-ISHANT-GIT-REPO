public class DigitsToWordsQ4 {

    public static void printDigitsInWords(int number) {
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String numStr = String.valueOf(number);

        // Check if the number is 3-digit
        if (numStr.length() != 3) {
            System.out.println("Please enter a 3-digit number.");
            return;
        }

        for (char digit : numStr.toCharArray()) {
            System.out.print(words[digit - '0'] + " ");
        }
        System.out.println(); // Move to next line after printing all digits
    }

    public static void main(String[] args) {
        int inputNumber = 951;
        printDigitsInWords(inputNumber);
    }
}
