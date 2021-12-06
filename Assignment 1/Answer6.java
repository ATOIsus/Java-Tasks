import java.util.Scanner;

public class Answer6 {

    public static void orderNumber() {

        // 6. Write a Java program that accepts three numbers from the user and prints "increasing" if
        //    the numbers are in increasing order, "decreasing" if the numbers are in decreasing
        //    order, and "Neither increasing or decreasing order" otherwise.


        Scanner sc = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int numberLargest = 0;
        int numberSmallest = 0;
        int numberMiddle = 0;


        System.out.print("Enter first  number: ");
        number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        number2 = sc.nextInt();

        System.out.print("Enter third  number: ");
        number3 = sc.nextInt();


        if (number1 > number2 && number1 > number3) {
            numberLargest = number1;
        } else {
            numberSmallest = number1;
        }

        if (number2 > number3 && number2 > number1) {
            numberLargest = number2;
        } else {
            numberSmallest = number2;
        }

        if (number3 > number2 && number3 > number1) {
            numberLargest = number3;
        } else {
            numberSmallest = number3;
        }

        System.out.println(" ");

        if (number1 != numberLargest || number1 != numberSmallest) {
            numberMiddle = number1;
        } else if (number2 != numberLargest || number2 != numberSmallest) {
            numberMiddle = number2;
        } else {
            numberMiddle = number3;
        }


        System.out.println("The largest  number is " + numberLargest);
        System.out.println("The middle   number is " + numberMiddle);
        System.out.println("The smallest number is " + numberSmallest);


    }

    public static void main(String[] args) {
        orderNumber();
    }

}
