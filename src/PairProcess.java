import javax.swing.*;
import java.util.Scanner;
public class PairProcess {
    public static void main(String[] args) {
        int num1, num2, sum, product, average;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        sum = num1 + num2;
        product = num1 * num2;
        average = sum / 2;

        System.out.println("the average of the two numbers are "+average);
        System.out.println("the product of the two numbers are "+product);

        if (sum > 200) {
            if (sum < 1000) {
                System.out.println("the sum of the two numbers are " + sum + "~");
            } else
            {
                System.out.println("the sum of the two numbers are " + sum + "*");
            }
        }
    }
}
