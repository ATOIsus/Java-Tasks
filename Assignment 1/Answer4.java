import java.util.Scanner;

public class Answer4 {


    public static void ascendingOrder() {

        // 4. Write a Java program that reads a line of integers and then displays each
        //    integer and the sum of all integers

        int userInput;
        int lastDigit;
        int sumDigit = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        userInput = sc.nextInt();


        while (userInput > 0) {

            lastDigit = userInput % 10;
            sumDigit += lastDigit;
            userInput = userInput / 10;

            System.out.println("Individual number: " + lastDigit);

        }
        System.out.println(" ");
        System.out.println("The total sum is " + sumDigit);

    }


    public static void main(String[] args) {
        ascendingOrder();
    }
}
