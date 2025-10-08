public class MethodOverLoadDemoQ1 {
        public int add(int a, int b) {
            return a + b;
        }

        public int add(int a, int b, int c) {
            return a + b + c;
        }

        public double add(double a, double b) {
            return a + b;
        }

        public String add(String a, int b) {
            return a + " " + b;
        }

        public static void main(String[] args) {
            MethodOverLoadDemoQ1 adder = new MethodOverLoadDemoQ1();

            // Test all methods
            System.out.println("add(10, 20): " + adder.add(10, 20)); // 30
            System.out.println("add(10, 20, 30): " + adder.add(10, 20, 30)); // 60
            System.out.println("add(10.5, 20.1): " + adder.add(10.5, 20.1)); // 30.6
            System.out.println("add(\"Hello\", 20): " + adder.add("Hello", 20)); // Hello 20
        }
    }