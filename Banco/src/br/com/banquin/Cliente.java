package br.com.banquin;

public class Cliente {
    private String nome;
    private int idade;

    public Cliente(String nome, int idade) {
        if (idade < 21) {
            throw new IllegalArgumentException("Cliente não é elegível para abrir uma conta bancária.");
        }
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
