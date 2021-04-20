package br.com.siqueira.aula08Polimorfismo.classes;

public class Galinha extends Ave{

    public Galinha(String nome){
        this.tipo = "Galinha";
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.printf("%s: co co co \n", this.nome);
    }
}
