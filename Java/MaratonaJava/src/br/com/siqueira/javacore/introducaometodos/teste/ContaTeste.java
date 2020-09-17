package br.com.siqueira.javacore.introducaometodos.teste;

import br.com.siqueira.javacore.introducaometodos.classes.Conta;

public class ContaTeste {
    public static void main(String[] args){
        Conta minhaConta;

        minhaConta = new Conta();

        minhaConta.titular = "Gabriel";
        minhaConta.saldo = 350.0;

        // Saca 200 reais
        if (minhaConta.saca(400)) {
            System.out.println("Consegui Sacar");
        }else{
            System.out.println("Nao consegui Sacar");
        }

        // Deposita 500 reais
        minhaConta.deposita(500);


        System.out.printf("Saldo atual %f", minhaConta.saldo);
    }
}
