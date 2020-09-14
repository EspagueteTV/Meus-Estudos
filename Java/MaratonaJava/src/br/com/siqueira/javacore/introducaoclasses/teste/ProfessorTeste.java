package br.com.siqueira.javacore.introducaoclasses.teste;

import br.com.siqueira.javacore.introducaoclasses.classes.Professor;

import java.util.Scanner;

public class ProfessorTeste {
    public static void main(String[] args){
        Professor discente = new Professor();
        Scanner teclado = new Scanner(System.in);

        // Leitura dos dados para o objeto discente
        System.out.print("Informe o nome do Professor: ");
            discente.nome = teclado.nextLine();
        System.out.printf("Informe a matrícula do professor %s: ", discente.nome);
            discente.matricula = teclado.nextInt();
        System.out.printf("Informe o CPF do professor %s: ", discente.nome);
            discente.cpf = teclado.nextInt();
        System.out.printf("Informe o RG do professor %s: ", discente.nome);
            discente.rg = teclado.nextInt();

        System.out.println("-----> Apresentação dos Dados");
        System.out.printf("O professor %s tem o número de matrícula igual a %d \n", discente.nome, discente.matricula);
        System.out.printf("Seu RG é %d e o seu CPF é igual %d ", discente.rg, discente.cpf);

    }
}
