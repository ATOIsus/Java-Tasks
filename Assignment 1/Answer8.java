import java.util.Scanner;

public class Answer8 {

    public static void calculateBMI() {
        // 8. Write a Java program to compute body mass index (BMI).
        //Note:
        //     The formula is BMI = kg/m2 where kg is a person's weight in kilograms and m2
        //     is their height in metres squared.


        Scanner sc = new Scanner(System.in);


        float weight;
        float height;
        float bMI;

        System.out.print("Enter mass  in kg    : ");
        weight = sc.nextFloat();

        System.out.print("Enter height in meter: ");
        height = sc.nextFloat();

        bMI = weight / (height * height);

        System.out.println("Your BMI is " + bMI + " kg/m2");

    }


    public static void main(String[] args) {
        calculateBMI();
    }
}
