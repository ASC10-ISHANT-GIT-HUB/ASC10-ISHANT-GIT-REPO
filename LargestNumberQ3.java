public class LargestNumberQ3 {

    // Method to find the largest among three numbers
    public static int largest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // Main method to test the largest method
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 25;
        int num3 = 15;

        int largestNum = largest(num1, num2, num3);
        System.out.println("The largest number is: " + largestNum);
    }
}
