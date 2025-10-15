public class CaseConverter {
    public static void main(String[] args) {
        // Here's our original string
        String message = "Hello, World! This is a Test.";

        // Convert the entire string to uppercase
        String upperCaseMessage = message.toUpperCase();

        // Convert the entire string to lowercase
        String lowerCaseMessage = message.toLowerCase();

        // Let's print everything to see the results
        System.out.println("Original: " + message);
        System.out.println("UPPERCASE: " + upperCaseMessage);
        System.out.println("lowercase: " + lowerCaseMessage);
    }
}
