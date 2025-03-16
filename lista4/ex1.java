import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int arr[] = new int[5];

            for (int i = 0; i < 5; i++) {
                System.out.print((i + 1) + "° elemento: ");
                arr[i] = in.nextInt();
            }

            int M = Integer.MIN_VALUE, m = Integer.MAX_VALUE;
            for (int i = 0; i < 5; i++) {
                if (arr[i] > M)
                    M = arr[i];
                if (arr[i] < m)
                    m = arr[i];
            }

            System.out.println("Menor: " + m + "\nMaior: " + M);
        }
    }
}