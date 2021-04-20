package br.com.siqueira.atividadePolimorfismo.teste;

import br.com.siqueira.atividadePolimorfismo.classe.Circulo;
import br.com.siqueira.atividadePolimorfismo.classe.Forma;
import br.com.siqueira.atividadePolimorfismo.classe.Quadrado;
import br.com.siqueira.atividadePolimorfismo.classe.Retangulo;

public class TesteFormas {
    public static void main(String[] args){

        Forma vetor[] = new Forma[6];

        vetor[0] = new Quadrado(2);
        vetor[1] = new Quadrado(5);
        vetor[2] = new Retangulo(3, 4);
        vetor[3] = new Retangulo(2, 5);
        vetor[4] = new Circulo(4);
        vetor[5] = new Circulo(3);

        for(Forma form : vetor){
            System.out.printf("%s: área de %.2f, e perímetro de %.2f \n", form.getNomeForma(), form.area(), form.perimetro() );
        }
    }
}
