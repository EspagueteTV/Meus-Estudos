package br.com.siqueira.aula05.exercicio.teste;

import br.com.siqueira.aula05.exercicio.classe.Relogio;

public class TesteRelogio {
    public static void main(String[] args) {
        
        Relogio r1 = new Relogio();
        Relogio r2 = new Relogio(22, 59, 57);

        for (int i = 1; i <= 5; i++) {
            r1.incrementar(i);
            r2.incrementar();
            System.out.println(
                    "R1 = " + r1.verHorario() + "\t" +
                            "R2 = " + r2.verHorario());
        }
    }
}
