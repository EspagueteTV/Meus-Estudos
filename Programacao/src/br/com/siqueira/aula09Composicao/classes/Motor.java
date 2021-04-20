package br.com.siqueira.aula09Composicao.classes;

public class Motor {
    private double potencia;

    public Motor() {
        this.potencia = 0;
    }

    public Motor(double potencia){
        setPotencia(potencia);
    }


    public void setPotencia(double potencia){
        this.potencia = potencia;
    }
    public double getPotencia(){
        return this.potencia;
    }
}
