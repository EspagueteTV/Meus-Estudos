package br.com.siqueira.aula07interface.teste;

import br.com.siqueira.aula07interface.classes.Carro;

public class Interface {
    public static void main(String[] args){

        Carro carro1 = new Carro();

        carro1.getNome();
        carro1.getFabricante();
        carro1.getModelo();
        carro1.getId();
    }
}
