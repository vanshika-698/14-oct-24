import java.util.Scanner;

public class Calculator33 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

     
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

      
        System.out.println("Choose an operation: ");
        System.out.println("1: Addition (+)");
        System.out.println("2: Subtraction (-)");
        System.out.println("3: Multiplication (*)");
        System.out.println("4: Division (/)");

        int choice = input.nextInt(); 

    
        switch (choice) {
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;
            case 4:
                
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation choice.");
                break;
        }
        
        input.close(); 
    }
}
