import java.util.Scanner;

public class PairProcess {

    public static void main(String[] args) {
        int num1, num2;
        int sum = 0;
        int product = 0;
        double average = 0.0;
        double count = 0.0;     // Decided to count the numbers entered instead of hard coding the value 2.
                                // The first try running the program had count as an int.  After running,
                                // I noticed that the average of 155 and 72 was 113.0, which is not correct.
                                // The program did integer division first and then converted the average to
                                // a double.  To fix this, the type for count was changed from int to double.

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();
        count++;

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();
        count++;

        sum = num1 + num2;
        product = num1 * num2;
        average = sum / count;

        if (sum > 200) {
            System.out.println("The sum of num1 and num2 is: *" + sum);
        }
        else {
            System.out.println("The sum of num1 and num2 is: " + sum);
        }
        System.out.println("The product of num1 and num2 is: " + product);
        System.out.println("The average of num1 and num2 is: " + average);
    }
}
