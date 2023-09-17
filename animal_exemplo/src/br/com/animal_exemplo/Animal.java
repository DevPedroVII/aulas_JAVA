package br.com.animal_exemplo;
//Animal.java
public abstract class Animal implements AnimalInterface {
 private String nome;
 private int idade;

 public Animal(String nome, int idade) {
     this.nome = nome;
     this.idade = idade;
 }

 public String getNome() {
     return nome;
 }

 @Override
 public void fazerSom() {
     System.out.println(nome + " faz um som genérico.");
 }

 @Override
 public void mover() {
     System.out.println(nome + " move-se de forma genérica.");
 }
}

