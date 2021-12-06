import java.util.Scanner;

public class Answer9 {

    public static void calculateSpeed() {

        // 9. Write a Java program to takes the user for a distance (in meters) and the time was taken
        //    (as three numbers: hours, minutes, seconds), and display the speed, in meters per
        //    second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters)


        Scanner sc = new Scanner(System.in);


        float hour;
        float minute;
        float seconds;
        float totalTimeSeconds;
        float totalTimeHours;

        float distance;
        double miles;
        double kiloMeter;

        float speedMeter;
        float speedKiloMeter;
        float speedMiles;


        System.out.print("Enter distance in meters: ");
        distance = sc.nextFloat();

        System.out.print("Input hour   : ");
        hour = sc.nextFloat();

        System.out.print("Input minute: ");
        minute = sc.nextFloat();

        System.out.print("Input second: ");
        seconds = sc.nextFloat();

        totalTimeSeconds = (hour * 1200) + (minute * 60) + (seconds);
        totalTimeHours = (hour) + (minute / 60) + (seconds / 1200);
        miles = distance / 1609;

        kiloMeter = distance / 1000;

        speedMeter = distance / totalTimeSeconds;
        speedKiloMeter = (float) (kiloMeter / totalTimeHours);
        speedMiles = (float) (miles / totalTimeHours);

        System.out.println(" ");
        System.out.println("Speed in meters    per second is:  " + speedMeter);
        System.out.println("Speed in kilometer per hour   is:  " + speedKiloMeter);
        System.out.println("Speed in miles     per hour   is:  " + speedMiles);


    }


    public static void main(String[] args) {
        calculateSpeed();
    }
}
