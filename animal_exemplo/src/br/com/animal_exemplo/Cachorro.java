package br.com.animal_exemplo;

//Cachorro.java
public class Cachorro extends Animal {
 public Cachorro(String nome, int idade) {
     super(nome, idade);
 }

 @Override
 public void fazerSom() {
     System.out.println(getNome() + " faz latidos!");
 }
}
