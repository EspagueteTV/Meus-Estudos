package br.com.siqueira.trabalho2trimestre.teste;

// Esta é uma versão mais simplificada do código

import br.com.siqueira.trabalho2trimestre.classes.Conta;

public class ContaTeste {
    public static void main(String[] args){
        Conta conta1 = new Conta();
        Conta conta2 = new Conta("João", 12468, 357, 370.75, "3634-5178");

        Conta.instrucaoClasse();
        conta1.atualizarDados();


        conta1.depositar(50);
        conta1.depositar(conta2, 100);

        conta1.mostrarDados();
        conta2.mostrarDados();

        conta1.sacar(100);
        conta2.sacar(200);

        conta2.consultarSaldo();
        conta1.consultarSaldo();
    }
}
