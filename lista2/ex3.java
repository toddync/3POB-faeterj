import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) throws Exception {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("a = ");
            float a = in.nextFloat();
            
            System.out.print("b = ");
            float b = in.nextFloat();
            
            System.out.print("operação (+, -, /, *, ^): ");
            char op = in.next(".").charAt(0);
            float res = 0;
            
            switch(op) {
                case '+' -> res = a + b;
                case '-' -> res = a - b;
                case '*' -> res = a * b;
                case '/' -> res = a / b;
                case '^' -> res = (float) Math.pow(a, b);
                default -> throw new Exception("Operação inválida");
            }
            
            System.out.println(a + " " + op + " " + b + " = " + res);
        }
    }
}