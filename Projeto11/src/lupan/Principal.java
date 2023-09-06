package lupan;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        Pessoa pessoa = new Pessoa(nome, idade);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        if (pessoa.isMaiorIdade()) {
            System.out.println(pessoa.getNome() + " é maior de idade.");
        } else {
            System.out.println(pessoa.getNome() + " não é maior de idade.");
        }

        scanner.close();
    }
}
