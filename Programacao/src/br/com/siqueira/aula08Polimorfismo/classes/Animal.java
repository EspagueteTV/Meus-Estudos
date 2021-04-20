package br.com.siqueira.aula08Polimorfismo.classes;


public abstract class Animal{
    protected String tipo;
    protected String nome;

    // Não tem implementação na SuperClasse
    // Obrigatória a implementação na subClasse
    public abstract void emitirSom();


}
