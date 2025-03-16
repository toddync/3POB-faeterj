import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int arr[] = new int[10];

            for (int i = 0; i < 10; i++) {
                System.out.print((i + 1) + "° numero: ");
                arr[i] = in.nextInt();
            }

            System.out.print("numero para buscar: ");
            int needle = in.nextInt(), p = -1;

            for (int i = 0; i < 10; i++)
                if (arr[i] == needle) {
                    p = i;
                    break;
                }

            System.out.println(p == -1 ? "Número não encontrado." : p);
        }
    }
}