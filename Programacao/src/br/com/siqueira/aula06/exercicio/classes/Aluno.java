package br.com.siqueira.aula06.exercicio.classes;

public class Aluno {

    private String matricula;
    private String nome;
    private String endereco;

    public Aluno() {
    }

    public Aluno(String matricula, String nome, String endereco) {
        setMatricula(matricula);
        setNome(nome);
        setEndereco(endereco);
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

}
