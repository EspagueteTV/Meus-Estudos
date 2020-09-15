package br.com.siqueira.javacore.introducaometodos.classes;
// Crie os seguintes atributos para a classe: nome, matricula, rg, cpf
// em seguida, crie uma classe de teste para preencher e imprimir os dados desse professor

public class Professor {

    public String nome;
    public String rg;
    public String cpf;
    public String matricula;

    public void imprimi(){
        System.out.println("-=-=-=-=-=-=-=-=");
        System.out.println(this.nome);
        System.out.println(this.matricula);
        System.out.println(this.cpf);
        System.out.println(this.rg);

    }
}
