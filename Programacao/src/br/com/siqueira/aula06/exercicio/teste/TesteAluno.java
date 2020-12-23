package br.com.siqueira.aula06.exercicio.teste;

import br.com.siqueira.aula06.exercicio.classes.Aluno;

public class TesteAluno {

    public static void main(String[] args) {

        // Classe Aluno
        Aluno aluno = new Aluno();

        aluno.setNome("Gabriel");
        aluno.setMatricula("111-222-33");
        aluno.setEndereco("Brasil");

        System.out.println("-=-= Dados do Aluno -=-=");
        System.out.printf("Nome: %s \n", aluno.getNome());
        System.out.printf("Matricula:: %s \n", aluno.getMatricula());
        System.out.printf("Endereço: %s \n ", aluno.getEndereco());
        System.out.println("-=-= FIM -=-=");



    }


}
