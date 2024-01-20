import java.util.Scanner;

public class day2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Rest of your code here
            //question 3
            int a = sc.nextInt();
            System.out.println(a > 8);


            //question 4
            float v = sc.nextFloat();
            float u = sc.nextFloat();
            float a1 = sc.nextFloat();
            float s = sc.nextFloat();

            float res = (v * v - u * u) / (2.0f * a1 * s);
            System.out.println(res);

            //question 5

            System.out.println(7 * 49 / 7 + 35 / 7);
        } finally {
            // Close the scanner in a finally block to ensure it is always closed
            sc.close();
        }
    }
}
