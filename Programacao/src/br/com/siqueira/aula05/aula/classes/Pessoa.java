package br.com.siqueira.aula05.aula.classes;

import java.util.Calendar;
import java.util.Scanner;

public class Pessoa {

    String nome;
    String nrCpf;
    int anoNascimento;
    int anoAtual;

    public void lerDados() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
            nome = teclado.next();
        System.out.print("Digite seu número de CPF: ");
            nrCpf = teclado.next();
        System.out.print("Digite seu ano de nascimento: ");
            anoNascimento = teclado.nextInt();
    }

    // método construtor
    public Pessoa(){
        System.out.println("Inicializando Objeto...");
        lerDados();
    }

    // método construtor com parâmetro
    public Pessoa(String nome, String nrCPF, int anoNascimento){

        this.nome = nome;
        this.nrCpf = nrCPF;
        this.anoNascimento = anoNascimento;
    }

    public void mostrarDados() {
        System.out.printf("Nome: %s \n", nome);
        System.out.printf("CPF: %s \n", nrCpf);
        System.out.printf("Ano de Nascimento: %d \n", anoNascimento);
        System.out.printf("Idade: %d \n", calcularIdade());

    }

    // Calcular idade com base no ano atual
    public int calcularIdade() {
        Calendar calendario = Calendar.getInstance();
        anoAtual = calendario.get(Calendar.YEAR);
        return anoAtual - anoNascimento;
    }

    // Sobrecarga do método calcular
    public int calcularIdade(int anoBase){
        return anoBase - anoNascimento;
    }
}
