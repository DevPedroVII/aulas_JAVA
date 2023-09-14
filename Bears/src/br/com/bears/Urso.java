package br.com.bears;

public class Urso {
    private String nomeCientifico;
    private String habitat;
    private String dieta;
    private String tempoGestacao;
    private String cores;
    private String comportamento;
    private String tamanhoMedio;
    private String pesoMedio;
    private String tempoVida;

    public Urso(String nomeCientifico, String habitat, String dieta, String tempoGestacao,
                String cores, String comportamento, String tamanhoMedio, String pesoMedio, String tempoVida) {
        this.nomeCientifico = nomeCientifico;
        this.habitat = habitat;
        this.dieta = dieta;
        this.tempoGestacao = tempoGestacao;
        this.cores = cores;
        this.comportamento = comportamento;
        this.tamanhoMedio = tamanhoMedio;
        this.pesoMedio = pesoMedio;
        this.tempoVida = tempoVida;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getDieta() {
        return dieta;
    }

    public String getTempoGestacao() {
        return tempoGestacao;
    }

    public String getCores() {
        return cores;
    }

    public String getComportamento() {
        return comportamento;
    }

    public String getTamanhoMedio() {
        return tamanhoMedio;
    }

    public String getPesoMedio() {
        return pesoMedio;
    }

    public String getTempoVida() {
        return tempoVida;
    }
}
