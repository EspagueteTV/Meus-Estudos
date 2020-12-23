package br.com.siqueira.aula07herenca.classes;

import java.util.Date;

public class Aluno extends Pessoa {

    private String matricula;

    public Aluno(String nome, String cpf, Date dataNascimento) {
        super(nome, cpf, dataNascimento);
    }

    public Aluno(String nome, String cpf, Date dataNascimento, String matricula) {
        super(nome, cpf, dataNascimento);
        setMatricula(matricula);
    }

    @Override
    public double tirarCopias(int quantidade) {
        return  0.07 * (double) quantidade;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }
}
