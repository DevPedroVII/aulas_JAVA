package br.com.packs;

class ConcreteClassB extends TemplateClass {
    @Override
    protected void step1() {
        System.out.println("ConcreteClassB - Step 1");
    }

    @Override
    protected void step2() {
        System.out.println("ConcreteClassB - Step 2");
    }

    @Override
    protected void step3() {
        System.out.println("ConcreteClassB - Step 3 (custom implementation)");
    }
}
