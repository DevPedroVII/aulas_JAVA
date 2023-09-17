package br.com.animal_exemplo;

//Gato.java
public class Gato extends Animal {
 public Gato(String nome, int idade) {
     super(nome, idade);
 }

 @Override
 public void fazerSom() {
     System.out.println(getNome() + " faz miados!");
 }
}
