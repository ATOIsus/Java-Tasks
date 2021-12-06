import java.util.Scanner;

public class Answer2 {

    public static void checkPalindrom() {


        // 2. Write a Java program that checks whether a given string is a palindrome or
        //    not. Ex: MADAM is a palindrome?

        Scanner sc = new Scanner(System.in);

        String userInput;
        String palindrom = "";

        System.out.print("Enter a string: ");
        userInput = sc.nextLine();

        for(int i = userInput.length()-1; i >=0 ; i--){
            palindrom += userInput.charAt(i);
        }

        if (palindrom.equals(userInput)) {
            System.out.println(userInput + " is a palindrom.");
        }else{
            System.out.println(userInput + " is not a palindrom.");
        }

    }


    public static void main(String[] args){

        checkPalindrom();

    }

}
