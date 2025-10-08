public class MultiplicationTableQ3 {

    public static void usingForLoop(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void usingWhileLoop(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }
    }

    public static void usingDoWhileLoop(int num) {
        int i = 1;
        do {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        } while (i <= 10);
    }

    public static void main(String[] args) {
        usingForLoop(2);
        usingWhileLoop(3);
        usingDoWhileLoop(4);
    }
}