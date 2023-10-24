package Funções.com;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
						
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Entre Tree numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = Max(a, b, c);
		
		showResult(higher);
		
		
		sc.close();

	}

	public static int Max (int x, int y, int z) {
		int aux;
		
		if (x > y && x > z ) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}else {
			aux = z;
		}
		
		return aux;
	}
		public static void showResult(int value) {
			System.out.println("Higher = " + value);
		}

	}

