package br.com.siqueira.aula09Composicao.teste;

import br.com.siqueira.aula09Composicao.classes.Automovel;
import br.com.siqueira.aula09Composicao.classes.Motor;
import br.com.siqueira.aula09Composicao.classes.Pneu;

public class Garagem {
    public static void main(String[] args){
        //Partes
        Motor m1 = new Motor(1000);
        Pneu p1 = new Pneu("Pirelli", 30);
        Pneu p2 = new Pneu("Michelin", 30);
        Pneu p3 = new Pneu("Firestone", 30);
        Pneu p4 = new Pneu("Bridgestone", 30);

        //Todos
        Automovel a1 = new Automovel();
        a1.setMarca("GM");
        a1.setKm(50000);
        a1.setMotor(m1);
        a1.setPneus(p1, 0);
        a1.setPneus(p2, 1);
        a1.setPneus(p3, 2);
        a1.setPneus(p4, 3);

        a1.mostrar();
    }
}
