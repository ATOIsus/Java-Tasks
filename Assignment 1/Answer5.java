public class Answer5 {

    public static void pattern1() {
        // 5. Write a Java program to display the following star pattern
        // a Square Star Pattern.

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();
    }


    public static void pattern2() {
        // b) Hollow Square Star Pattern

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4) {
                    System.out.print("*");
                } else if (j == 0 || j == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }


    public static void pattern3() {
        // c) Pyramid Star Pattern

        int noRow = 5;

        for (int i = 0; i < noRow; i++) {
            for (int k = i; k < noRow; k++)
                System.out.print("  ");

            for (int j = 0; j <= 2 * i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();

    }

    public static void pattern4() {
        // d) Inverted Pyramid Star Pattern

        int noRow = 5;

        for (int i = 5; i > 0; i--) {
            for (int k = i; k < noRow; k++)
                System.out.print("  ");

            for (int j = 2 * i; j > 1; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();

    }


    public static void main(String[] args) {

        pattern1();

        pattern2();

        pattern3();

        pattern4();
    }

}
