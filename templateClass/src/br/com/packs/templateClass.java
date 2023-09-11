package br.com.packs;

abstract class TemplateClass {
    public void templateMethod() {
        // Etapa 1
        step1();

        // Etapa 2
        step2();

        // Etapa 3
        step3();
    }

    protected abstract void step1();
    protected abstract void step2();

    // Método opcional que pode ser substituído pelas subclasses
    protected void step3() {
        System.out.println("Step 3 (default implementation)");
    }
}
