package lupan;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        if (novoNome != null && !novoNome.isEmpty()) {
            nome = novoNome;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        if (novaIdade >= 0) {
            idade = novaIdade;
        }
    }

    public boolean isMaiorIdade() {
        return idade >= 18;
    }
}
