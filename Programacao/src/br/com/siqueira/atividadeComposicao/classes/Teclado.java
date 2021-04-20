package br.com.siqueira.atividadeComposicao.classes;

public class Teclado {
    private String padraoTeclas;

    public Teclado(){
        setPadraoTeclas("Indefinido");
    }
    public Teclado(String padraoTeclas){
        setPadraoTeclas(padraoTeclas);
    }

    @Override
    public String toString(){
        return "Padrão de teclas: " + getPadraoTeclas();
    }
    public String getPadraoTeclas() {
        return padraoTeclas;
    }

    public void setPadraoTeclas(String padraoTeclas) {
        this.padraoTeclas = padraoTeclas;
    }
}

