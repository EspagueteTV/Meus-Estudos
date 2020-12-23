package br.com.siqueira.aula06.exercicio.teste;

import br.com.siqueira.aula06.exercicio.classes.Conta;

public class TesteConta {

    public static void main(String[] args){

        Conta conta = new Conta();

        conta.setNome_titular("Tony Stark");
        conta.setNr_conta(1234);
        conta.setSaldo_atual(12000000);

        System.out.println("-=-= Dados do Usuário -=-=");
        System.out.printf("Nome do Titular: %s \n", conta.getNome_titular());
        System.out.printf("Número da Conta: %d \n", conta.getNr_conta());
        System.out.printf("Saldo atual: R$ %.2f \n", conta.getSaldo_atual());

    }
}
