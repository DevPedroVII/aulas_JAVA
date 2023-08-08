package packg;

public class Programa1 {

	public static void main(String[] args) {
		int numero = 5;
		if (numero > 5) {
			System.out.println("O numero " +  numero  + " é maior que 5");
		}else if (numero == 5) {
			System.out.println("O numero " +  numero  + " é igual a 5" );
		}else if (numero % 2 == 0){
			System.out.println("o numero " + numero + " é par");
		}
		else{
			System.out.println("O numero " +  numero  + " menor que 5" );
		}
	
	}

}
