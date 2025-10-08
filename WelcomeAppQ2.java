public class WelcomeAppQ2 {

    // Method to generate welcome message
    public static String welcomeMessage(String name) {
        return "Hello " + name + ", Welcome to Java World!";
    }

    // Main method to invoke the welcomeMessage method
    public static void main(String[] args) {
        String name = "Alice"; // You can change the name here
        String message = welcomeMessage(name); // Call the method
        System.out.println(message); // Display the message
    }
}
