import java.util.ArrayList;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            ArrayList<Double> arr = new ArrayList<>();

            while (true) {
                System.out.print((arr.size() + 1) + "° numero: ");
                arr.add(in.nextDouble());

                if (arr.getLast() == -1)
                    break;
            }

            arr.removeLast();

            Double sum = 0.0;
            for (Double v : arr)
                sum += v;

            System.out.println("Soma: " + sum);
            System.out.println("Media: " + (sum / arr.size()));
        }
    }
}