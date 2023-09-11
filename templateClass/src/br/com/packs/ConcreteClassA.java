package br.com.packs;

class ConcreteClassA extends TemplateClass {
    @Override
    protected void step1() {
        System.out.println("ConcreteClassA - Step 1");
    }

    @Override
    protected void step2() {
        System.out.println("ConcreteClassA - Step 2");
    }
}
