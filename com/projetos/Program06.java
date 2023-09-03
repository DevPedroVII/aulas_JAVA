//Switch
package com.projetos;

public class Program06 {
	
	public static void main(String[] args) {
		int numero = 2;	
		
		switch (numero) {
			case 0:
				System.out.println("numero é 0");
				break;
			case 3:
				System.out.println("numero é 3");
				break;
			case  5:
				System.out.println("numero é 5");
				break;
		default:
			System.out.println("numero é" + numero);
			break;
		}
	}

}
