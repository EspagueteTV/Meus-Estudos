package br.com.siqueira.javacore.introducaometodos.classes;

public class Estudante {
    public String nome;
    public int idade;
    public double notas[] = new double[3];

    public void imprimirDados(Estudante aluno) {
        System.out.println("---- IMPRESSÃO DE DADOS ----");
        System.out.printf("Nome do Estudante: %s \n", aluno.nome);
        System.out.printf("Idade do Estudante: %d \n", aluno.idade);
        tirarMedia(aluno);


    }

    public static void tirarMedia(Estudante aluno) {
        double soma = 0;
        int quantNotas = aluno.notas.length;

        for (int c = 0; c < quantNotas; c++) {
            soma += aluno.notas[c];
        }
        double media = soma / quantNotas;

        System.out.printf("A média do estudante foi %.2f, e o estudante está ", media);
        if (media < 7.0) {
            System.out.print("REPROVADO!");
        } else {
            System.out.print("APROVADO");
        }
    }
}

