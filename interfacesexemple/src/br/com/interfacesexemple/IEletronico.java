package br.com.interfacesexemple;

/*
 * Uma Interface pode conter :
 * Constantes;
 * Metodos abstratos;
 * não tem metodos concretos EXP:
 *  public String mensagem () {
 *       return "Mensagem";
 *  }
 */

public interface IEletronico {
	public String MARCA = "Geek";
	
	public void ligar();
	
	public void desligar();

}

