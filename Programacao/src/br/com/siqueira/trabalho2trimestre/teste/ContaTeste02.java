package br.com.siqueira.trabalho2trimestre.teste;

import br.com.siqueira.trabalho2trimestre.classes.Conta;
import br.com.siqueira.trabalho2trimestre.classes.Conta2;

import java.util.Scanner;

public class ContaTeste02 {
    public static void main(String[] args){

        Conta2 conta1 = new Conta2();
        Scanner teclado = new Scanner(System.in);

        System.out.println(conta1.menu());
        boolean op = true;

        while(op){
            switch (conta1.menu()){
                case 1:
                    conta1.mostrarDados();
                    break;
                case 2:
                    System.out.print("Quantos reais você deseja depositar: ");
                    double deposito = teclado.nextFloat();
                    conta1.depositar(deposito);
                    break;
                case 5:
                    op = false;
            }
        }

    }

}
