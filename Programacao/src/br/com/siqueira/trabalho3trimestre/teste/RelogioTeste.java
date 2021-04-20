package br.com.siqueira.trabalho3trimestre.teste;

import br.com.siqueira.trabalho3trimestre.classe.Cronometro;
import br.com.siqueira.trabalho3trimestre.classe.Despertador;
import br.com.siqueira.trabalho3trimestre.classe.Relogio;

public class RelogioTeste {

    public static void main(String[] args) {

//        --------------------- CLASSE RELóGIO --------------------------

        Relogio r1 = new Relogio(0, 1, 1);

        System.out.println("Horario Inicial: " + r1.horarioAtual());
        r1.incrementar();
        r1.incrementar(2);
        r1.incrementar(1, 1);
        r1.incrementar(1, 1, 1);

        r1.decrementar();
        r1.decrementar(2);
        r1.decrementar(1, 1);
        r1.decrementar(1, 1, 1);

        r1.ajustarHorario(30, 23, 11);
        System.out.println(r1.horarioAtual());

//        --------------------- CLASSE CRONÔMETRO --------------------------

        Cronometro r2 = new Cronometro(0, 0, 0, 0);

        System.out.println("Horario atual; " + r2.horarioAtual());
        r2.incrementar();
        r2.decrementar();

//        --------------------- CLASSE DESPERTADOR --------------------------

        Despertador r3 = new Despertador(59, 32, 2);

        r3.horarioDespertador(2, 34);
        r3.ativarAlarme();
        r3.incrementar();

    }
}
