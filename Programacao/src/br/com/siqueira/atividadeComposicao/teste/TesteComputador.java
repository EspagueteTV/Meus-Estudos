package br.com.siqueira.atividadeComposicao.teste;

import br.com.siqueira.atividadeComposicao.classes.*;

public class TesteComputador {
    public static void main(String[] args) {

        //Partes
        CPU cpu1 = new CPU("Intel", 2.41);
        Monitor monitor1 = new Monitor(21);
        Teclado teclado1 = new Teclado("ABNT2");
        Mouse mouse1 = new Mouse(22, "Sem fio");
        HD hd1 = new HD("SSD", 128);
        HD hd2 = new HD("Sata", 1024);


        //Todos
        Computador c1 = new Computador();
        c1.setCpu(cpu1);
        c1.setMonitor(monitor1);
        c1.setTeclado(teclado1);
        c1.setMouse(mouse1);
        c1.setHds(hd1, 0);
        c1.setHds(hd2, 1);

        c1.mostrar();
    }
}
