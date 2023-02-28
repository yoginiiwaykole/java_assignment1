
import java.util.Scanner;
import java.lang.Math;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    UserInput userInput = new UserInput();

    System.out.println("Enter two numbers for basic operations: ");
    double[] numbers = userInput.getTwoNumbers(sc);

    Calculator calculator = new Calculator();
    double resultAdd = calculator.performAddition(numbers);
    double resultSubtract = calculator.performSubtraction(numbers);
    double resultMultiply = calculator.performMultiplication(numbers);
    double resultDivide = calculator.performDivision(numbers);

    System.out.println("Addition: " + resultAdd);
    System.out.println("Subtraction: " + resultSubtract);
    System.out.println("Multiplication: " + resultMultiply);
    System.out.println("Division: " + resultDivide);

    System.out.println("Enter size of array: ");
    int size = sc.nextInt();
    double[] array = userInput.getArray(sc, size);

    double sum = calculator.sumArray(array);
    double variance = calculator.varianceArray(array);
    double standardDeviation = calculator.standardDeviationArray(array);

    System.out.println("Sum of array: " + sum);
    System.out.println("Variance of array: " + variance);
    System.out.println("Standard deviation of array: " + standardDeviation);
  }
}
