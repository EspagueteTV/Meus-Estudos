package br.com.siqueira.aula06.aula.classe;

import java.util.Calendar;

public class Pessoa {

    // atributos privados
    private String nome;
    private int anoNascimento;

    public int calcularIdade() {
        Calendar calendario = Calendar.getInstance();
        int anoAtual = calendario.get(Calendar.YEAR) - anoNascimento;
        return (anoAtual - anoNascimento);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getAnoNascimento() {
        return this.anoNascimento;
    }
}

