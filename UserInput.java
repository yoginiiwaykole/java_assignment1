import java.util.Scanner;

public class UserInput{
  public double[] getTwoNumbers(Scanner sc) {
    double[] numbers = new double[2];

    for (int i = 0; i < 2; i++) {
      System.out.print("Enter number " + (i + 1) + ": ");
      numbers[i] = sc.nextDouble();
    }

    return numbers;
  }

  public double[] getArray(Scanner sc, int size) {
    double[] array = new double[size];

    for (int i = 0; i < size; i++) {
      System.out.print("Enter element " + (i + 1) + ": ");
      array[i] = sc.nextDouble();
    }

    return array;
  }
}