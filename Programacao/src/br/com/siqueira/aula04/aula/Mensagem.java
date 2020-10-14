package br.com.siqueira.aula04.aula;

public class Mensagem {

    String mensagem;    // variavel de classe

    // método de instancia
    public void mostrarMensagem(String titulo) {
        System.out.printf("%s \n %s \n", titulo, this.mensagem);
    }

    // método de classe
    static void mostraMsg(String mensagem){
        System.out.println(mensagem);
    }

    String buscarMensagem(){
        return mensagem;
    }

    public static void main(String[] args) {



        Mensagem msg = new Mensagem();
        Mensagem msg2 = new Mensagem();

        msg.mensagem = "Boa Tarde!";
        msg2.mensagem = "Bom Dia!";

        System.out.println(msg.mensagem);
        System.out.println(msg2.mensagem);

        msg.mostrarMensagem("Olá");
        msg2.mostrarMensagem("Oi");

        Mensagem.mostraMsg("Mensagem Mostrada!");
        System.out.println("Mensagem 1 = " + msg.buscarMensagem());
        System.out.println("Mensagem 2 = " + msg2.buscarMensagem());

    }
}


