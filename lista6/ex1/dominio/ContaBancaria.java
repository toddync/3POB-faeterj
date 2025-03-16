package dominio;

public class ContaBancaria {
    private String titular;
    private Double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String titular) {
        this.titular = titular;
    }

    public ContaBancaria(String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void exibirSaldo() {
        System.out.println("R$" + this.saldo);
    }

    public void depositar(Double saldo) {
        this.saldo += saldo;
    }

    public Double sacar(Double saldo) throws Exception {
        if (this.saldo > saldo) {
            this.saldo -= saldo;
            return saldo;
        } else {
            throw new Exception("Saldo insuficiente");
        }
    }
}