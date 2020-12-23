package br.com.siqueira.trabalho3trimestre.classe;

public class Relogio {

    protected int hora;
    protected int minuto;
    protected int segundo;

    /* Construtores */
    public Relogio() {
        setHora(0);
        setMinuto(0);
        setSegundo(0);
    }

    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    /* Métodos da Classe */

    public void incrementar() {
        if (this.segundo < 59) {
            this.segundo++;
        } else if (this.minuto < 59) {
            this.segundo = 0;
            this.minuto += 1;
        } else if (this.hora < 23) {
            this.segundo = 0;
            this.minuto = 0;
            this.hora += 1;
        } else {
            this.segundo = 0;
            this.minuto = 0;
            this.hora = 0;
        }
        System.out.println(horarioAtual());
    }

    public void incrementar(int segundo) {
        if ((this.segundo + segundo) < 59) {
            this.segundo += segundo;
        } else if (this.minuto < 59) {
            this.segundo = (60 - (this.segundo + segundo));
            this.minuto += 1;
        } else if (this.hora < 23) {
            this.segundo = (60 - (this.segundo + segundo));
            this.minuto = 0;
            this.hora += 1;
        } else {
            this.segundo = (60 - (this.segundo + segundo));
            this.minuto = 0;
            this.hora = 0;
        }
        System.out.println(horarioAtual());

    }

    public void incrementar(int segundo, int minuto){
        incrementar(segundo);
        if((this.minuto + minuto) < 59){
            this.minuto += minuto;

        }else if(this.hora < 23){
            this.minuto = (60 - (this.minuto + minuto));
            this.hora += 1;
        }else{
            this.minuto = (60 - (this.minuto + minuto));
            this.hora = 0;
        }

        System.out.println(horarioAtual());
    }

    public void decrementar() {
        if (this.segundo > 0) {
            this.segundo--;
        } else if (this.minuto > 0) {
            this.segundo = 59;
            this.minuto -= 1;
        } else if (this.hora > 0) {
            this.segundo = 59;
            this.minuto = 59;
            this.hora -= 1;
        } else {
            this.segundo = 59;
            this.minuto = 59;
            this.hora = 23;
        }

        System.out.println(horarioAtual());

    }

    public void ajustarHorario(int segundo, int minuto, int hora){
        if(segundo > -1 && segundo < 60){
            setSegundo(segundo);
        }else{
            System.out.println("Não foi possível ajustar os Segundos, o valor informado não estava entre 0 e 59.");
        }

        if(minuto > -1 && minuto < 60){
            setMinuto(minuto);
        }else{
            System.out.println("Não foi possível ajustar os Minutos, o valor informado não estava entre 0 e 59.");
        }

        if(hora > -1 && hora < 23){
            setHora(hora);
        }else{
            System.out.println("Não foi possível ajustar a Hora, o valor informaddo não estava entre 0 e 23");
        }
    }

    public String horarioAtual() {
        return (getHora() + ":" + getMinuto() + ":" + getSegundo());
    }

    /* Métodos getter e setter */
    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getHora() {
        return this.hora;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public int getSegundo() {
        return this.segundo;
    }
}
