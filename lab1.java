import java.util.InputMismatchException;
import java.util.Scanner;
public class lab1 {
    public static void main(String[] args) {
        System.out.println("lab1");
        Scanner in = new Scanner(System.in);
        int a = 0;
        try {
            System.out.println("Введите число:");
            a = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введите целое число.");
            System.exit(1);
        }
        int b = 0;
        try {
            System.out.println("Введите число:");
            b = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введите целое число.");
            System.exit(1);
        }
        int c = 0;
        try {
            System.out.println("Введите число:");
            c = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введите целое число.");
            System.exit(1);
        }
        int d = 0;
        try {
            System.out.println("Введите число:");
            d = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введите целое число.");
            System.exit(1);
        }
        if (a < b & a < c & a < d) {
            System.out.print(a);
        } else if (b < a & b < c & b < d) {
            System.out.print(b);
        } else if (c < a & c < b & c < d) {
            System.out.print(c);
        } else if (d < b & d < c & d < a) {
            System.out.print(d);
        }
        in.close();
    }
}
