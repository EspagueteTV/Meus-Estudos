package br.com.siqueira.aula08Polimorfismo.classes;

public class Cachorro extends Mamifero{

    public Cachorro(String nome){
        this.tipo = "Cachorro";
        this.nome = nome;
    }

    @Override
    public void emitirSom() {
        System.out.printf("%s: au au au \n", this.nome);
    }
}
