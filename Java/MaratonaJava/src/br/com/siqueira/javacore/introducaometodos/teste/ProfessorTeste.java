package br.com.siqueira.javacore.introducaometodos.teste;

import br.com.siqueira.javacore.introducaometodos.classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args){
        Professor prof = new Professor();
        prof.cpf = "234.765.987-09";
        prof.matricula = "111222";
        prof.nome = "Marcos";
        prof.rg = "1.987.098";

        prof.imprimi();
    }
}
