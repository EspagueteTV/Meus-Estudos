package br.com.siqueira.aula04.exercicios.classes.Exercio04;

import java.util.Calendar;
import java.util.Scanner;

public class Pessoa {

    Scanner teclado = new Scanner(System.in);
    Calendar data = Calendar.getInstance();

    String nome;
    String nrCPF;
    int anoNascimento;

    public void lerDados(){
        System.out.print("Informe seu nome: ");
            nome = teclado.next();
        System.out.print("Informe seu número de CPF: ");
            nrCPF = teclado.next();
        System.out.print("Informe seu ano de nascimento: ");
            anoNascimento = teclado.nextInt();
    }

    public void mostrarDados(){
        System.out.println("-=-= APRESENTAÇÃO DADOS USUÁRIO =-=-");
        System.out.printf("Nome: %s \n", nome);
        System.out.printf("CPF: %s \n", nrCPF);
        System.out.printf("Ano da Nascimento: %d \n", anoNascimento);
        System.out.printf("Idade Atual: %d \n", calcularIdade());
    }

    public int calcularIdade(){
        int anoAtual = data.get(Calendar.YEAR);
        return anoAtual - anoNascimento;
    }

}
