import controle.GerenciadorConta;

public class ex1 {
    public static void main(String[] args) {
        GerenciadorConta gerenciador = new GerenciadorConta();

        gerenciador.iniciar();
        gerenciador.close();
    }
}