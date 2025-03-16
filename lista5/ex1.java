import java.util.ArrayList;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            ArrayList<Integer> arr = new ArrayList<>();
            int i = 0;

            while (true) {
                i++;
                System.out.print(i + "° numero: ");
                arr.add(in.nextInt());

                System.out.print("Deseja continuar? (y/n): ");
                if (in.next(".").toLowerCase().charAt(0) != 'y')
                    break;
            }

            System.out.println(arr);
        }
    }
}