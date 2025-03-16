import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int arr[] = new int[8], c = 0;

            for (int i = 0; i < 8; i++) {
                System.out.print((i + 1) + "° numero: ");
                arr[i] = in.nextInt();
            }

            for (int i = 0; i < 8; i++)
                c += arr[i] % 2 == 0 ? 1 : 0;

            System.out.println(c + " numeros pares");
        }
    }
}