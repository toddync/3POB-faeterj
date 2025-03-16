import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int arr[] = new int[6];
            for (int i = 0; i < 6; i++) {
                System.out.print((i + 1) + "° numero: ");
                arr[i] = in.nextInt();
            }

            for (int i = 5; i >= 0; i--)
                System.out.println(arr[i]);
        }
    }
}