package br.com.siqueira.aula07herenca.classes;

import java.util.Date;

public class Professor extends Pessoa {

    private double salario;
    private String disciplina;

    public Professor() {

    }

    public Professor(String nome, String cpf, Date dataNascimento) {
        super(nome, cpf, dataNascimento);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getDisciplina() {
        return this.disciplina;
    }
}
