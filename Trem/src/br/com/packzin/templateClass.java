package br.com.packzin;

public abstract class templateClass {
    public final void templateMethod() {
        // Etapa comum 1
        step2();

        // Etapa específica para subclasses
        step2();

        // Etapa comum 3
        step3();
    }

    protected abstract void step2();

    // Método com implementação padrão
    protected void step3() {
        System.out.println("Executando etapa comum 3");
    }
}
