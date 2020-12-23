package br.com.siqueira.trabalho2trimestre.classes;

import java.util.Scanner;

public class Conta2 {

    private String nomeResponsavel;
    private int numeroConta;
    private int agencia;
    private double saldo;
    private String telefone;

    public Conta2() {
        setNomeResponsavel("Indefinido");
        setNumeroConta(0);
        setAgencia(0);
        setSaldo(0.0);
        setTelefone("0000-0000");
    }

    public Conta2(String nomeResponsavel, int numeroConta, int agencia, double saldo, String telefone) {
        setNomeResponsavel(nomeResponsavel);
        setNumeroConta(numeroConta);
        setAgencia(agencia);
        setSaldo(saldo);
        setTelefone(telefone);
    }

    public static void logoBanco() {
        System.out.println("-=-=-=-=-=-=-=-=-=");
        System.out.println("\t Banco IFC \t");
        System.out.println("-=-=-=-=-=-=-=-=-=");
    }

    public static void instrucaoClasse() {
        logoBanco();
        System.out.println("Para a criação de um objeto da Classe Conta deverá ser informado: ");
        System.out.println("--> Nome do Responsável ");
        System.out.println("--> Número da Conta");
        System.out.println("--> Número da Agência: ");
        System.out.println("--> Telefone de Contato: \n");
    }

    public void linha(){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    public void mostrarDados() {
        linha();
        System.out.println("\t DADOS DO CLIENTE");
        linha();
        System.out.printf("Nome: %s \n", getNomeResponsavel());
        System.out.printf("Número da Conta: %d \n", getNumeroConta());
        System.out.printf("Agência: %d \n", getAgencia());
        System.out.printf("Saldo Atual: R$ %.2f \n", getSaldo());
        System.out.printf("Telefone de contato: %s \n\n", getTelefone());
    }

    public void consultarSaldo() {
        linha();
        System.out.println("Nome do Titular: " + getNomeResponsavel());
        System.out.println("Seu saldo atual é igual a R$ " + getSaldo());
    }

    public void depositar(double saldo) {
        this.saldo += saldo;
    }

    public void depositar(Conta conta, double saldo) {
        conta.setSaldo(conta.getSaldo() + saldo);
    }

    public void sacar(double saque) {
        linha();
        if (this.saldo > saque) {
            this.saldo -= saque;
            System.out.println("Saque realizado com sucesso..");

        } else {
            System.out.println("Esse valor não poderá ser sacado. Saldo atual: " + getSaldo());
        }
    }

    public int menu(){
        Scanner teclado = new Scanner(System.in);

        logoBanco();
        System.out.println("1 - Mostrar Dados da Conta ");
        System.out.println("2 - Realizar um deposito ");
        System.out.println("3 - Consultar Saldo Atual");
        System.out.println("4 - Realizar um Saque ");
        System.out.println("5 - Sair");
        System.out.print("Sua opção: ");

        return teclado.nextInt();
    }

    // Métodos Get e Set

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNomeResponsavel() {
        return this.nomeResponsavel;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getTelefone() {
        return this.telefone;
    }

}
