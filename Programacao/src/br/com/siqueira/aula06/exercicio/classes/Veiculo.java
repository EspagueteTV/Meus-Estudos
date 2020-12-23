package br.com.siqueira.aula06.exercicio.classes;

public class Veiculo {

    private String placa;
    private String modelo;
    private int nr_passageiros;
    private double consumo_medio;

    public Veiculo() {
    }

    public Veiculo(String placa, String modelo, int nr_passageiros, double consumo_medio) {
        setPlaca(placa);
        setModelo(modelo);
        setNr_passageiros(nr_passageiros);
        setConsumo_medio(consumo_medio);
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNr_passageiros(int nr_passageiros) {
        this.nr_passageiros = nr_passageiros;
    }

    public void setConsumo_medio(double consumo_medio) {
        this.consumo_medio = consumo_medio;
    }

    public String getPlaca(){
        return this.placa;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getNr_passageiros(){
        return this.nr_passageiros;
    }

    public double getConsumo_medio(){
        return this.consumo_medio;
    }



}
