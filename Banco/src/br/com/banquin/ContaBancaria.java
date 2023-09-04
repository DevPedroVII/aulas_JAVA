package br.com.banquin;

public class ContaBancaria {
    private String nomeCliente;
    private double saldo;
    private double limite;

    public ContaBancaria(String nomeCliente, double limite) {
        this.nomeCliente = nomeCliente;
        this.saldo = 0.0;
        this.limite = limite;
    }

    // Método para realizar um depósito na conta
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de depósito inválido.");
        }
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    // Método para realizar um saque na conta
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque inválido.");
        }

        if (valor > saldo + limite) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
        }
        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso.");
    }

    // Método para obter o saldo atual da conta
    public double getSaldo() {
        return saldo;
    }
}
