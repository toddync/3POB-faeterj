import java.util.ArrayList;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            ArrayList<Integer> arr = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                System.out.print((i + 1) + "° numero: ");
                arr.add(in.nextInt());
            }

            System.out.print("numero a ser contado: ");
            int n = in.nextInt(), c = 0;

            for (int x : arr)
                if (x == n)
                    c++;

            System.out.println(c + " ocorrencias");
        }
    }
}