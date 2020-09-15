package br.com.siqueira.javacore.introducaoclasses.teste;

import br.com.siqueira.javacore.introducaoclasses.classes.Professor;

import java.util.Scanner;

public class ProfessorTeste {
    public static void main(String[] args){
        Professor discente = new Professor();
        Professor discente2 = new Professor();
        Scanner teclado = new Scanner(System.in);

        // Leitura dos dados para o objeto discente

            discente.nome = "Homer";
            discente.matricula = 2019314207;
            discente.cpf = 431234543;
            discente.rg = 3123654;

        discente2.nome = "Marge";
        discente2.matricula = 876534207;
        discente2.cpf = 431234543;
        discente2.rg = 31236765;

        System.out.println("-----> Apresentação dos Dados");
        System.out.printf("O professor %s tem o número de matrícula igual a %d \n", discente.nome, discente.matricula);
        System.out.printf("Seu RG é %d e o seu CPF é igual %d ", discente.rg, discente.cpf);

    }
}
