package com.atividades;

import java.util.Locale;
import java.util.Scanner;

public class java_atividade {
	public static void main(String[]arg ) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		if (minutos > 100) {
			conta = conta + (minutos - 100) * 2.0;
		}
		
		System.out.printf("Valor Da conta = R$ %.2f%n", conta);
		sc.close();
		
		
	}

}
