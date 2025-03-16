import java.util.ArrayList;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            ArrayList<String> arr = new ArrayList<>();

            for (int i = 0; i < 5; i++) {
                System.out.print((i + 1) + "° nome: ");
                arr.add(in.nextLine());
            }

            System.out.print("nome a ser removido: ");
            String x = in.nextLine();

            if (arr.contains(x)) {
                arr.remove(x);
            } else {
                System.out.println("não encontrado");
                return;
            }

            System.out.println(arr);
        }
    }
}