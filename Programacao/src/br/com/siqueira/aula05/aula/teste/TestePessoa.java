package br.com.siqueira.aula05.aula.teste;

import br.com.siqueira.aula05.aula.classes.Pessoa;

public class TestePessoa {

    public static void main(String[] args){
        Pessoa p1 = new Pessoa();

        Pessoa p2 = new Pessoa("Paulo", "321", 2008);

        System.out.println("Dados da Pessoa 01");
            p1.mostrarDados();

        System.out.println("Dados da Pessoa 02");
            p2.mostrarDados();

    }
}
