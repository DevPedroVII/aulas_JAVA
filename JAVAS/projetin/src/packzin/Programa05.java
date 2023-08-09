//Operador ternario

//main + Ctrl Space
package packzin;

public class Programa05 {
	
	public static void main(String[] args) {
		int valor = 3, numero;
		/*
		if (valor > 0 ) {
			numero = valor;
		}else { 
			numero = 7;
		}
		*/
		numero = (valor > 0)? valor : 7;
		System.out.println(numero);
	}

}
