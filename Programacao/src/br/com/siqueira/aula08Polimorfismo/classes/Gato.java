package br.com.siqueira.aula08Polimorfismo.classes;

public class Gato extends Mamifero{

    public Gato(String nome){
        this.tipo = "Gato";
        this.nome = nome;
    }
    public void emitirSom(){
        System.out.printf("%s: miau miau\n", this.nome);
    }
}
