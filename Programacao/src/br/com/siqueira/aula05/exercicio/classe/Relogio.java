package br.com.siqueira.aula05.exercicio.classe;

public class Relogio {

    int hora;
    int minuto;
    int segundo;

    public Relogio() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Relogio(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void incrementar() {
        if (segundo < 59) {
            segundo += 1;
        } else if (minuto < 59) {
            minuto += 1;
            segundo = 0;
        } else if(hora < 23){
            hora += 1;
            minuto = 0;
            segundo = 0;
        }else{
            hora = 0;
            minuto = 0;
            segundo = 0;
        }
    }

    public void incrementar(int segundo) {
        if ((this.segundo + segundo) < 59) {
            this.segundo += segundo;
        } else if (minuto < 59) {
            minuto += 1;
            this.segundo = segundo - 1;
        } else if(hora < 23){
            hora += 1;
            minuto = 0;
            this.segundo = segundo - 1;
        }else{
            hora = 0;
            minuto = 0;
            this.segundo = segundo - 1;
        }
    }

    public String verHorario() {
        return hora + ":" + minuto + ":" + segundo;
    }
}
