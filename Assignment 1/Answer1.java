import java.util.Scanner;

public class Answer1 {


    public static void primeNumber() {

        //  1. Write a Java program that prompts the user for an integer and then prints
        //     out all the prime numbers up to that Integer?


        Scanner sc = new Scanner(System.in);

        int userInput;
        boolean isPrime = false;

        System.out.println(" ");
        System.out.print("Enter a number : ");
        userInput = sc.nextInt();

        if (userInput <= 1) {
            System.out.println("No prime numbers. ");
        } else if(userInput == 2){
            System.out.println("2 is only the prime number");
        }else {

            for (int i = userInput; i > 1; i--) {

                for (int j = 2; j <= userInput; j++) {
                    if (i == j){
                        isPrime = true;
                    }else if (i % j == 0) {
                        isPrime = false;
                        break;
                    } else {
                        isPrime = true;
                    }
                }

                if (isPrime) {
                    System.out.println(i + " is prime");
                }

            }

        }
    }



    public static void main(String[] args){

        primeNumber();

    }


}
