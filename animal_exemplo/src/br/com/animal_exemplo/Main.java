package br.com.animal_exemplo;

//Main.java
public class Main {
 public static void main(String[] args) {
     AnimalInterface animal1 = new Cachorro("Rex", 3);
     AnimalInterface animal2 = new Gato("Whiskers", 2);

     animal1.fazerSom();
     animal1.mover();

     animal2.fazerSom();
     animal2.mover();
 }
}
