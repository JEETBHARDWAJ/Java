public class Factorial {
    static int fact = 1; // Initialize fact to 1

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            fact = fact * (Integer.parseInt(args[i])); // Update the fact value
        }
        System.out.println(fact); // Print the factorial result
    }
}
