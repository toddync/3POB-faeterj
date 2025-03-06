import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("x1 = ");
            float x1 = in.nextFloat();
            System.out.print("y1 = ");
            float y1 = in.nextFloat();

            System.out.print("x2 = ");
            float x2 = in.nextFloat();
            System.out.print("y2 = ");
            float y2 = in.nextFloat();

            System.out.println("US$ = " + Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1,2)));
        }
    }
}