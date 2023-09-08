package br.com.packzin;

public class concreteClass2 extends templateClass {
    @Override
    protected void step2() {
        System.out.println("Executando etapa específica para ConcreteClass2");
    }

    @Override
    protected void step3() {
        System.out.println("Sobrescrevendo a etapa comum 3 para ConcreteClass2");
    }
}
