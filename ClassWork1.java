import java.util.Scanner;

public class ClassWork1 {

    public static void maximumNumberTwo(){

        // Write a program to find maximum between two numbers.


        float firstNum;
        float secondNum;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        firstNum = sc.nextFloat();

        System.out.print("Enter second number: ");
        secondNum = sc.nextFloat();

        if (firstNum > secondNum){
            System.out.println(firstNum + " is greater.");
        }else if (secondNum > firstNum){
            System.out.println(secondNum + " is grater");
        }else{
            System.out.println("Both are equal.");
        }
    }


    public static void maximumNumberThree(){

        // Write a program to find maximum between three numbers.

        int numberFirst;
        int numberSecond;
        int numberThird;
        int numberLargest = 0;
        int numberSmallest = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        numberFirst = sc.nextInt();
        System.out.print("Enter second number: ");
        numberSecond = sc.nextInt();
        System.out.print("Enter third number: ");
        numberThird = sc.nextInt();

        if (numberThird == numberFirst && numberThird == numberSecond){
            System.out.println("All numbers are same. ");
        }
        else{
            if (numberFirst > numberSecond && numberFirst > numberThird ){
                numberLargest = numberFirst;
            }else if (numberFirst < numberSecond && numberFirst < numberThird){
                numberSmallest = numberFirst;
            }

            if (numberSecond > numberFirst && numberSecond > numberThird){
                numberLargest = numberSecond;
            }else if (numberSecond < numberFirst && numberSecond < numberThird){
                numberSmallest = numberSecond;
            }

            if (numberThird > numberFirst && numberThird > numberSecond ){
                numberLargest = numberThird;
            }else if (numberThird < numberFirst && numberThird < numberSecond){
                numberSmallest = numberThird;
            }

            System.out.println("The largest number is " + numberLargest + " and smallest is " + numberSmallest);
        }
    }


    public static void checkLeapYear(){

        // Write a program to check weather a year is a leap or not.

        int userYear;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");
        userYear = sc.nextInt();

        if (userYear % 4 == 0){
            System.out.println("The year " + userYear + " is a leap year.");
        }else{
            System.out.println("The year " + userYear + " is not a leap year.");
        }
    }


    public static void checkVowel(){

        // Write a program to check weather a character is vowel or consonant.

        char userInput;
        char[] vowelArray = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        boolean isVowel = false;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        userInput = sc.next().charAt(0);


        for (int i = 0; i < 1; i++){
            if(userInput == vowelArray[i]){
                System.out.println("The entered '" + userInput + "' is a vowel.");
                isVowel = true;
                break;
            }
        }

        if(!isVowel){
            System.out.println("The entered '" + userInput + "' is a consonant.");
        }
    }


    public static void checkMarks(){

        /*
        Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.
        Calculate percentage and grade according to following:
           Percentage >= 90% : Grade A
           Percentage >= 80% : Grade B
           Percentage >= 70% : Grade C
           Percentage >= 60% : Grade D
           Percentage >= 40% : Grade E
           Percentage < 40%  : Grade F
        */

        float physics;
        float chemistry;
        float biology;
        float math;
        float computer;
        float gradingMarks;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks of Physics     : ");
        physics = sc.nextFloat();
        System.out.print("Enter the marks of Chemistry   : ");
        chemistry = sc.nextFloat();
        System.out.print("Enter the marks of Biology     : ");
        biology = sc.nextFloat();
        System.out.print("Enter the marks of Mathematics : ");
        math = sc.nextFloat();
        System.out.print("Enter the marks of Computer    : ");
        computer = sc.nextFloat();

        gradingMarks = (physics + chemistry + biology + math + computer) / 5;

        if(gradingMarks < 40){
            System.out.println("The grade is F.");
        }else if(gradingMarks >= 40 && gradingMarks < 60){
            System.out.println("The grade is E.");
        }else if(gradingMarks >= 60 && gradingMarks < 70){
            System.out.println("The grade is D");
        }else if(gradingMarks >= 70 && gradingMarks < 80){
            System.out.println("The grade is C");
        }else if(gradingMarks >= 80 && gradingMarks < 90){
            System.out.println("The grade is B");
        }else{
            System.out.println("The grade is A");
        }
    }


    public static void main(String[] args){

        System.out.println();
        maximumNumberTwo();

        System.out.println();
        maximumNumberThree();

        System.out.println();
        checkLeapYear();

        System.out.println();
        checkVowel();

        System.out.println();
        checkMarks();

    }
}
