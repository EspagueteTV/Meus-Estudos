package br.com.siqueira.atividadePolimorfismo.classe;

public abstract class Forma {

    protected String nomeForma;

    public Forma(String nomeForma){
        this.nomeForma = nomeForma;
    }

    public abstract double area();

    public abstract double perimetro();

    public void setNomeForma(String nomeForma){
        this.nomeForma = nomeForma;
    }
    public String getNomeForma(){
        return this.nomeForma;
    }


}
