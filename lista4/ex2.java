import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            float arr[] = new float[4], sum = 0;

            for (int i = 0; i < 4; i++) {
                System.out.print((i + 1) + "° nota: ");
                arr[i] = in.nextFloat();
            }

            for (float n : arr)
                sum += n;

            System.out.println(sum >= 7 ? "Aprovado" : "Reprovado");
        }
    }
}