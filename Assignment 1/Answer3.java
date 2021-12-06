import java.util.Scanner;

public class Answer3 {

    public static void ascendingOrder() {

        // 3. Write a Java program for sorting a given list of names in ascending order?


        String stringName[];
        int numberOfNames;

        Scanner sc = new Scanner(System.in);

        System.out.print("How many names do you want to enter: ");
        numberOfNames = sc.nextInt();

        System.out.println(" ");
        stringName = new String[numberOfNames];
        System.out.println("Enter Names: ");

        for (int i = 0; i < numberOfNames; i++) {
            stringName[i] = sc.next();
        }

        for (int i = 0; i < numberOfNames; i++) {
            for (int j = i + 1; j < numberOfNames; j++) {
                if (stringName[i].compareTo(stringName[j]) > 0) {
                    String t = stringName[i];
                    stringName[i] = stringName[j];
                    stringName[j] = t;
                }
            }
        }
        System.out.println(" ");
        System.out.println("Names in ascending order are: ");

        for (int i = 0; i < numberOfNames; i++) {
            System.out.println(stringName[i]);
        }
    }


    public static void main(String[] args) {
        ascendingOrder();
    }
}
