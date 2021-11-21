import java.util.Scanner;

public class Task1 {

    public static void checkSquare(){

        float length;
        float breadth;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        length = sc.nextFloat();

        System.out.print("Enter Breadth: ");
        breadth = sc.nextFloat();


        if (length == breadth){
            System.out.println("The rectangle is a square.");
        }
        else{
            System.out.println("The rectangle is not a square.");
        }
    }

    public static void greaterNumber(){

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

    public static  void discountCode(){

        float costPrice;
        float discountRate = 10;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost price: ");
        costPrice = sc.nextFloat();

        if (costPrice > 1000){
            float discountAmount = (costPrice * discountRate) /100;
            float totalPrice = costPrice - discountAmount;
            System.out.println("The total price is: " + totalPrice);
        }else{
            System.out.println("The total price is: " + costPrice);
        }
    }

    public static void gradingSystem(){
        float gradingMarks;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks: ");
        gradingMarks = sc.nextFloat();

        if(gradingMarks < 25){
            System.out.println("The grade is F.");
        }else if(gradingMarks >= 25 && gradingMarks < 45){
            System.out.println("The grade is E.");
        }else if(gradingMarks >= 45 && gradingMarks < 50){
            System.out.println("The grade is D");
        }else if(gradingMarks >= 50 && gradingMarks < 60){
            System.out.println("The grade is C");
        }else if(gradingMarks >= 60 && gradingMarks < 80){
            System.out.println("The grade is B");
        }else{
            System.out.println("The grade is A");
        }
    }

    public static void checkAge(){
        int age1;
        int age2;
        int age3;
        String oldestPerson = " ";
        String youngestPerson= " ";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of person1: ");
        age1 = sc.nextInt();
        System.out.print("Enter age of person2: ");
        age2 = sc.nextInt();
        System.out.print("Enter age of person3: ");
        age3 = sc.nextInt();

        if (age3 == age1 && age3 == age2){
            System.out.println("They are of same age. ");
        }
        else{
            if (age1 > age2 && age1 > age3 ){
                oldestPerson = "Person1";
            }else if (age1 < age2 && age1 < age3){
                youngestPerson = "Person1";
            }

            if (age2 > age1 && age2 > age3){
                oldestPerson = "Person2";
            }else if (age2 < age1 && age2 < age3){
                youngestPerson = "Person2";
            }

            if (age3 > age1 && age3 > age2 ){
                oldestPerson = "Person3";
            }else if (age3 < age1 && age3 < age2){
                youngestPerson = "Person3";
            }

            System.out.println("The oldest person is " + oldestPerson + " and the youngest is " + youngestPerson);
            }
    }

    public  static  void attendanceCalculator(){
        int numClasses;
        int numAttended;
        float attendancePercent;

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of classes held: ");
        numClasses = sc.nextInt();

        System.out.print("Number of classes attended: ");
        numAttended = sc.nextInt();

        attendancePercent = (numAttended *100) / numClasses;

        System.out.println("Your attendance percentage is " +attendancePercent);
    }

    public static void askMedicalCause(){
        char userAnswer;

        Scanner sc = new Scanner(System.in);

        System.out.print("Do you have a medical cause? Y or N:  ");
        userAnswer = sc.next().charAt(0);

        if (userAnswer == 'Y'){
            System.out.println("You are allowed to take the exam.");
        }else{
            System.out.println("You are not allowed to take the exam. ");
        }
    }

    public static void checkCase(){

        char userInput;
        boolean upperInput = false;
        char[] upperCase = {'A','B','C','D','E','F','G','H', 'I', 'J',
                              'K','L','M','N','O','P','Q','R','S','T',
                              'U', 'V', 'W', 'X', 'Y', 'Z'};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        userInput = sc.next().charAt(0);

        for (int i = 0; i < 26; i++){
            if (userInput == upperCase[i]){
                System.out.println("The entered '" + userInput + "' is Upper case.");
                upperInput = true;
                break;}
            }
        if(!upperInput){
            System.out.println("The entered '" + userInput + "' is lower case.");
        }
    }

    public static void checkLeap(){
        int userInput;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");
        userInput = sc.nextInt();

        if (userInput % 4 == 0){
            System.out.println(userInput + " is a leap year. ");
        }else{
            System.out.println(userInput + " is not a leap year. ");
        }
    }




    public  static  void main(String[] args) {

        System.out.println(" ");
        checkSquare();
        System.out.println(" ");

        greaterNumber();
        System.out.println(" ");

        discountCode();
        System.out.println(" ");

        gradingSystem();
        System.out.println(" ");

        checkAge();
        System.out.println(" ");

        attendanceCalculator();
        System.out.println(" ");

        askMedicalCause();
        System.out.println(" ");

        checkCase();
        System.out.println(" ");

        checkLeap();
        System.out.println(" ");

    }

}