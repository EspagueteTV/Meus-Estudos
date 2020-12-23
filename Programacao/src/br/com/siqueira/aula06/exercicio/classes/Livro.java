package br.com.siqueira.aula06.exercicio.classes;

public class Livro {

    private String titulo;
    private String autor;
    private int no_paginas;

    public Livro() {
    }

    public Livro(String titulo, String autor, int no_paginas) {
        setTitulo(titulo);
        setAutor(autor);
        setNo_paginas(no_paginas);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNo_paginas(int no_paginas) {
        this.no_paginas = no_paginas;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getNo_paginas() {
        return this.no_paginas;
    }
}
