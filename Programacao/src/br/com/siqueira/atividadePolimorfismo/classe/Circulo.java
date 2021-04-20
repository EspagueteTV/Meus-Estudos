package br.com.siqueira.atividadePolimorfismo.classe;

public class Circulo extends Forma{

    private double raio;


    public Circulo(double raio){
        super("Circulo");
        setRaio(raio);
    }

    public double area(){
        return raio * Math.pow(Math.PI, 2);
    }

    public double perimetro(){
        return 2 * Math.PI * raio;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }
    public double getRaio(){
        return this.raio;
    }
}
