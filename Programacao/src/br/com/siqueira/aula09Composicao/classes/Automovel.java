package br.com.siqueira.aula09Composicao.classes;

import java.util.ArrayList;

public class Automovel {
    private String marca;
    private int km;
    private Motor motor;
    //private Pneu[] pneus;
    private ArrayList<Pneu> pneus;

    public Automovel(){
        pneus = new ArrayList<Pneu>();
        marca = "Indefinida";
        motor = null;
        km = 0;
    }

    public void mostrar(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Km: " + getKm());
        System.out.printf("Motor: potencia %.2f \n", getMotor().getPotencia());
        System.out.println("Pneu: ");
        for(int i = 0; i < 4; i++){
            System.out.printf("Pneu %d: marca %s, pressão %d \n", i, pneus.get(i).getMarca(), pneus.get(i).getPressaoAr());
        }
    }
    public void setMotor(Motor motor){
        this.motor = motor;
    }

    public Motor getMotor(){
        return this.motor;
    }

    public void setPneus(Pneu pneu, int posicao){
        this.pneus.add(pneu);
    }

    public Pneu getPneus(int posicao){
        return pneus.get(posicao);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
}
