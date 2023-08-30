package passs;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista para armazenar pessoas
        List<Pessoa> listaDePessoas = new ArrayList<>();

        // Adicionando pessoas à lista
        listaDePessoas.add(new Pessoa("João", 25));
        listaDePessoas.add(new Pessoa("Maria", 30));
        listaDePessoas.add(new Pessoa("Pedro", 22));

        // Exibindo os dados das pessoas na lista
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println();
        }
    }
}
