package com.view;

import java.util.Scanner;

import com.model.Calcular;


public class Game {
	static Scanner teclado = new Scanner(System.in);
	static int pontos = 0;
	static Calcular calc;
	
	public static void main(String[] args) {
		Game.jogar();

	}
	
	public static void jogar() {
		System.out.println("Informe o nivel de dificuldade desejado [1, 2, 3 ou 4]: ");
		int dificuldade = Game.teclado.nextInt();
		
		Game.calc = new Calcular(dificuldade);
		
		System.out.println("Informe o Resultado da seguinte operação: ");
		
		//Somar
		if(calc.getOperacao()== 0 ){
			System.out.println(calc.getValor1() + " + " + calc.getValor2());
			int resposta = Game.teclado.nextInt();
			if(calc.somar(resposta)) {
				Game.pontos += 1;
				System.out.println("Você tem " + Game.pontos + " Ponto(s).");
			}
			}	//Diminuir
		if(calc.getOperacao()== 1 ){
			System.out.println(calc.getValor1() + " - " + calc.getValor2());
			int resposta = Game.teclado.nextInt();
			if(calc.diminuir(resposta)) {
				Game.pontos += 1;
				System.out.println("Você tem " + Game.pontos + " Ponto(s).");
			}
			}	//
		if(calc.getOperacao()== 2 ){
			System.out.println(calc.getValor1() + " * " + calc.getValor2());
			int resposta = Game.teclado.nextInt();
			if(calc.multiplicar(resposta)) {
				Game.pontos += 1;
				System.out.println("Você tem " + Game.pontos + " Ponto(s).");
			}
			}else {
				System.out.println("A Operação " + calc.getOperacao() + " não é reconhecida.");
			}
		
		System.out.println("Deseja continuar ? 1 - Sim 0 - não" );
		int continuar = Game.teclado.nextInt();
		if(continuar == 1) {
			Game.jogar();
	}else {
		System.out.println("Você fez " + Game.pontos + "Ponto(S)");
		System.out.println("Até mais");
		System.exit(0);}
	}

}
