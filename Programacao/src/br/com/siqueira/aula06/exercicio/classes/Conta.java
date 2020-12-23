package br.com.siqueira.aula06.exercicio.classes;

public class Conta {

    private int nr_conta;
    private String nome_titular;
    private double saldo_atual;

    public Conta() {
    }

    public Conta(int nr_conta, String nome_titular, double saldo_atual) {
        setNr_conta(nr_conta);
        setNome_titular(nome_titular);
        setSaldo_atual(saldo_atual);
    }

    public void setNr_conta(int nr_conta) {
        this.nr_conta = nr_conta;
    }

    public void setNome_titular(String nome_titular) {
        this.nome_titular = nome_titular;
    }

    public void setSaldo_atual(double saldo_atual) {
        this.saldo_atual = saldo_atual;
    }

    public int getNr_conta() {
        return this.nr_conta;
    }

    public String getNome_titular() {
        return this.nome_titular;
    }

    public double getSaldo_atual() {
        return this.saldo_atual;
    }
}
