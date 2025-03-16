package controle;

import dominio.ContaBancaria;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorConta {
    private final ArrayList<ContaBancaria> contas = new ArrayList<>();
    private final Scanner in = new Scanner(System.in);

    public GerenciadorConta() {
    }

    public void close() {
        in.close();
    }

    public void iniciar() {
        boolean i = true;
        while (i) {
            System.out.println("Escolha uma opção:");
            System.out.println("|  1) Criar Conta");
            System.out.println("|  2) Apagar Conta");
            System.out.println("|  3) Gerenciar Conta");
            System.out.println("|  4) Listar Contas");
            System.out.println("|  5) Sair");
            System.out.print("|: ");
            int opt = in.nextInt();

            switch (opt) {
                case 1 -> criarConta();
                case 2 -> apagarConta();
                case 3 -> gerenciarConta();
                case 4 -> {
                    for (ContaBancaria conta : contas)
                        System.out.println("|  | " + conta.getTitular() + ", R$" + conta.getSaldo());
                }
                case 5 -> i = false;
                default -> System.out.println("|  Opcao invalida");
            }
        }
    }

    private void criarConta() {
        System.out.println("|\n|  Criar Conta:");
        System.out.print("|  |  Titular: ");
        in.nextLine();
        String t = in.nextLine();

        System.out.print("|  |  Saldo: ");
        Double s = in.nextDouble();

        System.out.println("|");
        contas.add(new ContaBancaria(t, s));
    }

    private void apagarConta() {
        System.out.println("|\n|  Apagar Conta:");
        System.out.print("|  |  Titular: ");
        in.nextLine();
        String t = in.nextLine();

        int i = 0;
        for (; i < contas.size(); i++)
            if (contas.get(i).getTitular().equals(t))
                break;

        if (i == contas.size()) {
            System.out.print("|  |  !! Conta nao encontrada !!\n|");
        } else {
            contas.remove(i);
        }

        System.out.println("|");
    }

    private void gerenciarConta() {
        System.out.print("|  |  Titular: ");
        in.nextLine();
        String t = in.nextLine();

        int i = 0;
        for (; i < contas.size(); i++)
            if (contas.get(i).getTitular().equals(t))
                break;

        if (i == contas.size()) {
            System.out.print("|  |  !! Conta nao encontrada !!\n|");
            return;
        }

        ContaBancaria conta = contas.get(i);

        boolean b = true;
        while (b) {
            System.out.println("|  |  Gerenciar Conta:");
            System.out.println("|  |  1) Depositar ");
            System.out.println("|  |  2) Sacar ");
            System.out.println("|  |  3) Exibir saldo ");
            System.out.println("|  |  4) Voltar ");
            System.out.print("|  |: ");
            int opt = in.nextInt();

            switch (opt) {
                case 1 -> {
                    System.out.print("|  |  | Quantia: ");
                    Double quantia = in.nextDouble();
                    conta.depositar(quantia);
                }
                case 2 -> {
                    System.out.print("|  |  | Quantia: ");
                    Double quantia = in.nextDouble();
                    try {
                        conta.sacar(quantia);
                    } catch (Exception e) {
                        System.out.println("|  |  | !! " + e.getMessage() + " !!");
                    }
                }
                case 3 -> {
                    System.out.print("|  |  | ");
                    conta.exibirSaldo();
                }
                case 4 -> b = false;
            }
        }

        System.out.println("|");
    }
}