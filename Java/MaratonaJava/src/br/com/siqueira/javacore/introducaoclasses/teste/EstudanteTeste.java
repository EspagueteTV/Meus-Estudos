package br.com.siqueira.javacore.introducaoclasses.teste;

import br.com.siqueira.javacore.introducaoclasses.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args){
        // Tipo da variável vai ser a classe
        Estudante joao = new Estudante();   //Variável de referencia,  Objeto do tipo estudante

        //Colocar valores dentro da memória
        joao.nome = "João";
        joao.matricula = "1212";
        joao.idade = 15;

        System.out.println(joao.nome);
        System.out.println(joao.matricula);
        System.out.println(joao.idade);
    }
}
