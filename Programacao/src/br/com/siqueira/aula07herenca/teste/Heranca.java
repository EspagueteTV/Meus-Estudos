package br.com.siqueira.aula07herenca.teste;

import br.com.siqueira.aula07herenca.classes.Aluno;
import br.com.siqueira.aula07herenca.classes.Funcionario;
import br.com.siqueira.aula07herenca.classes.Professor;

import java.util.Date;

public class Heranca {
    public static void main(String args[]){

        System.out.println("-=-=-=-= ALUNO -=-=-=-=");
        Aluno aluno1 = new Aluno("João José", "123.456.789-01", new Date());
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("CPF: " + aluno1.getCpf());
        System.out.println("Data de Nascimento " + aluno1.getDataNascimento());

        System.out.println("\n-=-=-=-= PROFESSOR -=-=-=-=");
        Professor professor1 = new Professor("José Antônio", "987.654.321-09", new Date());
        System.out.println("Nome: " + professor1.getNome());
        System.out.println("CPF: " + professor1.getCpf());
        System.out.println("Data de Nascimento " + professor1.getDataNascimento());

        System.out.println("\n-=-=-=-= FUNCIONÁRIO -=-=-=-=");
        Funcionario funcionario1 = new Funcionario("José Batista", "987.632.321-09", new Date());
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("CPF: " + funcionario1.getCpf());
        System.out.println("Data de Nascimento " + funcionario1.getDataNascimento());

    }
}
