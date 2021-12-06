import java.util.Scanner;

public class Answer10 {

    public static void checkArmstrong() {

        // 10. Write a java program to check weather a given number is Armstrong number or not.
        //Note:
        //     An Armstrong number of a three-digit number is a number in which the sum of the cube
        //     of the digits is equal to the number itself. Hence 153 is an Armstrong number

        int userInput;
        int originalInput;
        int armstrong = 0;
        int lastDigit;
        int cubeDigit = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        userInput = sc.nextInt();

        originalInput = userInput;


        while (userInput > 0) {
            lastDigit = userInput % 10;
            cubeDigit += (int) Math.pow(lastDigit, 3);
            armstrong = +cubeDigit;
            userInput = userInput / 10;

        }

        if (armstrong == originalInput) {
            System.out.println(originalInput + " is an armstrong number.");
        } else {
            System.out.println(originalInput + " is not an armstrong number.");
        }

    }


    public static void main(String[] args) {
        checkArmstrong();
    }
}
