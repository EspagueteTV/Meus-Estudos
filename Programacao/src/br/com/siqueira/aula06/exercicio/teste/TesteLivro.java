package br.com.siqueira.aula06.exercicio.teste;

import br.com.siqueira.aula06.exercicio.classes.Livro;

public class TesteLivro {

    public static void main(String[] args){

        Livro livro = new Livro();

        livro.setTitulo("O Hobbit");
        livro.setAutor("J.R. Tolkien");
        livro.setNo_paginas(350);

        System.out.println("-=-= Dados do Livro -=-=");
        System.out.printf("Nome do Livro: %s \n", livro.getTitulo());
        System.out.printf("Autor do Livro: %s \n", livro.getAutor());
        System.out.printf("Número de Páginas: %d \n", livro.getNo_paginas());


    }
}
