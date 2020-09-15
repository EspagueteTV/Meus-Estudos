package br.com.siqueira.javacore.introducaometodos.classes;
// Crie os seguintes atributos para a classe: nome, matricula, rg, cpf
// em seguida, crie uma classe de teste para preencher e imprimir os dados desse professor

public class Professor {

    public String nome;
    public String rg;
    public String cpf;
    public String matricula;

    public void imprimi(Professor prof){        // Variável de Referência do tipo Professor
        System.out.println("-=-=-=-=-=-=-=-=");
        System.out.println(prof.nome);
        System.out.println(prof.matricula);
        System.out.println(prof.cpf);
        System.out.println(prof.rg);
    }
}
