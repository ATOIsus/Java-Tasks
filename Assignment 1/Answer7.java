import java.util.Scanner;

public class Answer7 {

    public static void checkNumber() {


        // 7. Write a Java program that accepts two floating-point numbers and checks whether they
        //    are the same up to two decimal places.

        Scanner sc = new Scanner(System.in);

        double numberOne;
        double numberTwo;

        System.out.print("Enter 1st number: ");
        numberOne = sc.nextDouble();

        System.out.print("Enter 2nd number: ");
        numberTwo = sc.nextDouble();

        System.out.println(" ");
        if (Math.abs(numberOne - numberTwo) <= 0.01) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are different");
        }
    }


    public static void main(String[] args) {
        checkNumber();
    }
}
