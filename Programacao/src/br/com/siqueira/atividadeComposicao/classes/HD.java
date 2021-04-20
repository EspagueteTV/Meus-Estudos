package br.com.siqueira.atividadeComposicao.classes;

public class HD {
    private String tipo;
    private int capacidade;

    public HD(){
        setTipo("Indefinido");
        setCapacidade(0);
    }

    public HD(String tipo, int capacidade){
        setTipo(tipo);
        setCapacidade(capacidade);
    }

    @Override
    public String toString(){
        return "Tipo: " + getTipo() + ", Capacidade: " + getCapacidade() + " GB";
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }

    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }
    public int getCapacidade(){
        return this.capacidade;
    }
}
