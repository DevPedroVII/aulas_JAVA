package br.com.packzin;

public class Main {
    public static void main(String[] args) {
        templateClass obj1 = new concreteClass1();
        obj1.templateMethod();

        templateClass obj2 = new concreteClass2();
        obj2.templateMethod();
    }
}
