package br.com.siqueira.atividadePolimorfismo.classe;

public class Retangulo extends Forma{

    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        super("Retangulo");
        setBase(base);
        setAltura(altura);
    }


    public double area(){
        return base * altura;
    }
    public double perimetro(){
        return (base * 2) + (altura * 2);
    }

    public void setBase(double base){
        this.base = base;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getBase(){
        return this.base;
    }
    public double getAltura(){
        return this.altura;
    }
}
