package br.com.siqueira.aula07herenca.classes;

import java.util.Date;

public class Funcionario extends Pessoa{

    private String cargo;
    private Date dataAdmisao;

    public Funcionario(String nome, String cpf, Date dataNascimento){
        super(nome, cpf, dataNascimento);
    }
    public Funcionario(String nome, String cpf, Date dataNascimento, String cargo, Date dataAdmisao){
        super(nome, cpf, dataNascimento);
        setCargo(cargo);
        setDataAdmisao(dataAdmisao);
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public void setDataAdmisao(Date dataAdmisao){
        this.dataAdmisao = dataAdmisao;
    }
    public String getCargo(){
        return this.cargo;
    }
    public Date getDataAdmisao(){
        return this.dataAdmisao;
    }
}
