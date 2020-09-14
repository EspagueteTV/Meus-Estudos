package br.com.siqueira.javacore.introducaoclasses.teste;

import br.com.siqueira.javacore.introducaoclasses.classes.Carro;

public class CarroTeste {
    public static void main(String[] args){
        Carro carro = new Carro();

        carro.modelo = "Fusca";
        carro.placa = "UML2511";
        carro.velocidadeMaxima = 120f;

        System.out.println(carro.placa);
        System.out.println(carro.modelo);
        System.out.println(carro.velocidadeMaxima);
    }
}
