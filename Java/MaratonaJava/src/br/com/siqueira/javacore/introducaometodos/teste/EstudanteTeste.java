package br.com.siqueira.javacore.introducaometodos.teste;

import br.com.siqueira.javacore.introducaometodos.classes.Estudante;

import java.util.Scanner;

public class EstudanteTeste {
    public static void main(String[] args){
        Estudante discente = new Estudante();
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o nome do aluno: ");
            discente.nome = teclado.nextLine();
        System.out.print("Informe a idade do aluno: ");
            discente.idade = teclado.nextInt();

        for(int c = 0; c < discente.notas.length; c++){
            System.out.printf("Digite a %dª nota do %s: ", c + 1, discente.nome);
                discente.notas[c] = teclado.nextDouble();
        }

        discente.imprimirDados(discente);
    }
}

