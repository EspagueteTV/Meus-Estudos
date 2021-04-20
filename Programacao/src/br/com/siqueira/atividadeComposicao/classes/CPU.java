package br.com.siqueira.atividadeComposicao.classes;

public class CPU {
    private String marca;
    private double frequencia;

    public CPU(){
        setMarca("Indefinido");
        setFrequencia(0);
    }

    public CPU(String marca, double frequencia){
        setMarca(marca);
        setFrequencia(frequencia);
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Frequencia: " + frequencia + "GHz";

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }
}
