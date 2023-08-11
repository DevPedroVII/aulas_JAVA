// while e do while

package packzin;

import java.util.Scanner;

public class Program007 {
	public static void main(String[] args) {
		
		int idade;
		String nome;
		
		//recebe Dados do usuario via teclado.
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual o seu nome?");
		nome = teclado.nextLine();
		
		System.out.println("DIga sua idade");
		idade = teclado.nextInt();
		
		System.out.println(nome + " Tem " + idade + " anos.");
		teclado.close();
	}

}
