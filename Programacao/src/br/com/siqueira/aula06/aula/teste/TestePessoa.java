package br.com.siqueira.aula06.aula.teste;

import br.com.siqueira.aula06.aula.classe.Pessoa;

public class TestePessoa {
    public static void main(String[] args){

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Ana");
        pessoa.setAnoNascimento(2000);

        System.out.print("Nome: " + pessoa.getNome());
        System.out.print("Ano Nascimento: " + pessoa.getAnoNascimento());
        System.out.print("Idade: " + pessoa.calcularIdade());
    }
}
