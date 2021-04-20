package br.com.siqueira.aula08Polimorfismo.teste;

import br.com.siqueira.aula08Polimorfismo.classes.Animal;
import br.com.siqueira.aula08Polimorfismo.classes.Cachorro;
import br.com.siqueira.aula08Polimorfismo.classes.Galinha;
import br.com.siqueira.aula08Polimorfismo.classes.Gato;

public class Zoologico {
    public static void main(String[] args){
//        Criar objetos
        Cachorro c1 = new Cachorro("Pluto");
        Cachorro c2 = new Cachorro("Floquinho");
        Gato g1 = new Gato("Mingau");
        Galinha h1 = new Galinha("Giserda");

//        Guardas os objetos em um vetor:
        Animal vetor[] = new Animal[4];
        vetor[0] = c1;
        vetor[1] = g1;
        vetor[2] = h1;
        vetor[3] = c2;

        for(int i = 0; i < vetor.length; i++){
            vetor[i].emitirSom();
        }
    }
}
