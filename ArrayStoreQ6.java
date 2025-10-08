import java.util.Scanner;

public class ArrayStoreQ6 {
    private int[] arr = new int[10];

    // Accept 10 integers and store them into the array
    public void acceptInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    // Display the array using a for loop
    public void displayWithForLoop() {
        System.out.println("Array elements (using for loop):");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Display the array using a while loop
    public void displayWithWhileLoop() {
        System.out.println("Array elements (using while loop):");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }

    // Sort the array (ascending order)
    public void sortArray() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array sorted.");
    }

    // Accept a number and return how many times it occurs
    public int countOccurrences(int num) {
        int count = 0;
        for (int value : arr) {
            if (value == num) {
                count++;
            }
        }
        return count;
    }

    // Insert a number at a specified position
    public void insertAtPosition(int num, int position) {
        if (position < 0 || position >= arr.length) {
            System.out.println("Invalid position!");
            return;
        }
        arr[position] = num;
        System.out.println("Number inserted at position " + position);
    }

    // Return an array with duplicate elements removed
    public int[] removeDuplicates() {
        int[] temp = new int[arr.length];
        int size = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < size; j++) {
                if (arr[i] == temp[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                temp[size++] = arr[i];
            }
        }

        // Create result array of correct size
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    // Main method to test functionality
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayStoreQ6 store = new ArrayStoreQ6();

        store.acceptInput();

        store.displayWithForLoop();
        store.displayWithWhileLoop();

        store.sortArray();
        store.displayWithForLoop();

        System.out.print("Enter a number to count its occurrences: ");
        int num = scanner.nextInt();
        int count = store.countOccurrences(num);
        System.out.println("Number " + num + " occurs " + count + " times.");

        System.out.print("Enter number to insert: ");
        int insertNum = scanner.nextInt();
        System.out.print("Enter position (0-9): ");
        int position = scanner.nextInt();
        store.insertAtPosition(insertNum, position);
        store.displayWithForLoop();

        int[] noDuplicates = store.removeDuplicates();
        System.out.println("Array without duplicates:");
        for (int val : noDuplicates) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
