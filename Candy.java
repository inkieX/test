public class Candy {
    private String name;
    private double price;
    // Four-function calculator method
    public static double calculate(double num1, double num2, String operation) {
        switch (operation) {
            case "add":
                return num1 + num2;
            case "subtract":
                return num1 - num2;
            case "multiply":
                return num1 * num2;
            case "divide":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new IllegalArgumentException("Division by zero is not allowed.");
                }
            default:
                throw new IllegalArgumentException("Invalid operation. Use 'add', 'subtract', 'multiply', or 'divide'.");
        }
    }
    

    public Candy(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println("Addition: " + calculate(10, 5, "add"));
        System.out.println("Subtraction: " + calculate(10, 5, "subtract"));
        System.out.println("Multiplication: " + calculate(10, 5, "multiply"));
        System.out.println("Division: " + calculate(10, 5, "divide"));
    }
}