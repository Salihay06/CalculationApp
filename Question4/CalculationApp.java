import java.util.Scanner;

public class CalculationApp {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        Calculator calculator = new Calculator();
        
        System.out.print("Your choice of a transaction (+, -, *, /, %, ^, !): ");
        String operator = scan.next();

        int num1 = 0, num2 = 0;
        if(!operator.equals("!")){
            System.out.println("Enter the first number: ");
            num1 = scan.nextInt();
            System.out.println("Enter the second number: ");
            num2 = scan.nextInt();
    
        }else{
            System.err.println(" Enter the number to be factorized");
            num1 = scan.nextInt();
        }
        switch (operator) {
            case "+":
                System.out.println("Result: " + calculator.add(num1, num2));
                break;
            case "-":
                System.out.println("Result: " + calculator.subtract(num1, num2));
                break;
            case "*":
                System.out.println("Result: " + calculator.multiply(num1, num2));
                break;
            case "/":
                System.out.println("Result: " + calculator.divide(num1, num2));
                break;
            case "%":
                System.out.println("Result: " + calculator.mod(num1, num2));
                break;
            case "^":
                System.out.println("Result: " + calculator.power(num1, num2));
                break;
            case "!":
                System.out.println("Result: " + calculator.factorial(num1));
                break;
            default:
                System.err.println("Invalid operator");
        }
      
    }
    
}
