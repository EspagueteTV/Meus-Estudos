package br.com.siqueira.atividadePolimorfismo.classe;

public class Quadrado extends Forma{

    private double lado;

    public Quadrado(double lado){
        super("Quadrado");
        setLado(lado);

    }

    public double area(){
        return lado * lado;
    }

    public double perimetro(){
        return lado * 4;
    }

    public void setLado(double lado){
        this.lado = lado;
    }
    public double getLado(){
        return this.lado;
    }
}
