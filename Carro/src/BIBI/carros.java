package BIBI;

class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    public void acelerar(int incremento) {
        velocidade += incremento;
    }

    public void frear(int decremento) {
        velocidade -= decremento;
        if (velocidade < 0) {
            velocidade = 0;
        }
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void imprimirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade: " + velocidade + " km/h");
    }
}
