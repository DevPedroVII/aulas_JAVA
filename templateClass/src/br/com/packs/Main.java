package br.com.packs;

public class Main {
    public static void main(String[] args) {
        TemplateClass classA = new ConcreteClassA();
        classA.templateMethod();

        TemplateClass classB = new ConcreteClassB();
        classB.templateMethod();
    }
}

