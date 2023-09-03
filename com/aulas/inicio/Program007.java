// while e do while

package com.aulas.inicio;

import java.util.Scanner;

public class Program007 {
	public static void main(String[] args) {
		
		int idade = 1;
		String nome;
		
		//recebe Dados do usuario via teclado.
		Scanner teclado = new Scanner(System.in);
		
		while(idade > 0) {
		System.out.println("Qual o seu nome?");
		nome = teclado.nextLine();
		
		System.out.println("DIga sua idade");
		// idade = teclado.nextInt(); Bug
		idade = Integer.parseInt(nome, teclado.nextInt());
		
		System.out.println(nome + " Tem " + idade + " anos.");
		teclado.close();
		
		}
	}

}
