package br.com.interfacesexemple;

/*
 * Uma Interface pode conter :
 * Constantes;
 * Metodos abstratos;
 * não tem metodos concretos EXP:
 *  public String mensagem () {
 *       return "Mensagem";
 *  }
 *  
 *  
 *  interface para servir  de contrato para produtos eletronicos. Todo
 *  produto eletronico que implementar esta interface OBRIGATORIAMENTE
 *  dever'ao implementar os metodos abstratos.
 */

public interface IEletronico {
	public String MARCA = "Geek";
	
	public void ligar();
	
	public void desligar();

}

