import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("n1 = ");
            float n1 = in.nextFloat();
            System.out.print("n2 = ");
            float n2 = in.nextFloat();
            System.out.print("n3 = ");
            System.out.println("media = " + ((in.nextFloat() + n1 + n2) / 3));
        }
    }
}