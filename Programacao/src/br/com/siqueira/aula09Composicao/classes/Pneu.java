package br.com.siqueira.aula09Composicao.classes;

public class Pneu {
    private String marca;
    private int pressaoAr;

    public Pneu(){
        marca = "Indefinida";
        pressaoAr = 0;
    }

    public Pneu(String marca, int pressaoAr){
        setMarca(marca);
        setPressaoAr(pressaoAr);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPressaoAr() {
        return pressaoAr;
    }

    public void setPressaoAr(int pressaoAr) {
        this.pressaoAr = pressaoAr;
    }
}
