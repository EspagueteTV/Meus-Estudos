package br.com.siqueira.aula07herenca.classes;

import java.util.Date;

public class Pessoa {
    private String nome;
    private String cpf;
    private Date dataNascimento;

    public Pessoa() {

    }

    public Pessoa(String nome, String cpf, Date dataNascimento) {
        setNome(nome);
        setCpf(cpf);
        setDataNascimento(dataNascimento);
    }

    public double tirarCopias(int quantidade){
        return 0.10 * (double) quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getDataNascimento() {
        return this.dataNascimento.toString();
    }


}
