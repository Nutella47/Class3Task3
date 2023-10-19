import java.util.Scanner;

public class Nurellad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The program calculates the roots of the equation ax^2+bx+c =0. ");
        System.out.print("Enter the value of a (and press Enter): ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b (and press Enter): ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c (and press Enter): ");
        double c = input.nextDouble();
        if (a == 0) {
            System.out.println("Not quadratic equation");
            return;
        }
        double  d = b * b - 4.0 * a * c;
        double x1, x2;
        System.out.printf("For a = %.2f, b = %.2f, c = %.2f%n", a, b, c);
        switch ((int) d) {
            case 0:
                x1 = -b / 2 * a;
                System.out.printf("x1 = %.2f", x1);
                break;
            default:
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.printf("x1 = %.2f%nx2 = %.2f", x1, x2);
                break;
        }
    }
}