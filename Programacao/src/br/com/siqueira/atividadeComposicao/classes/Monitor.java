package br.com.siqueira.atividadeComposicao.classes;

public class Monitor {
    private double tamanhoPolegadas;

    public Monitor(){
        setTamanhoPolegadas(0);
    }
    public Monitor(double tamanhoPolegadas){
        setTamanhoPolegadas(tamanhoPolegadas);
    }

    @Override
    public String toString(){
        return "Tamanho: " + getTamanhoPolegadas() + " polegadas";
    }

    public double getTamanhoPolegadas() {
        return tamanhoPolegadas;
    }

    public void setTamanhoPolegadas(double tamanhopoletagas) {
        this.tamanhoPolegadas = tamanhopoletagas;
    }
}
