package br.com.siqueira.trabalho3trimestre.classe;

public class Cronometro extends Relogio{

    protected int centesimo;

    public Cronometro(){
        setCentesimo(0);
        setSegundo(0);
        setMinuto(0);
        setHora(0);
    }

    public Cronometro(int centesimo, int segundo, int minuto, int hora){
        setCentesimo(centesimo);
        setSegundo(segundo);
        setMinuto(minuto);
        setHora(hora);
    }

    @Override
    public void incrementar(){
        if(this.centesimo < 99){
            this.centesimo ++;
        }else {
            this.centesimo = 0;
            if(this.segundo < 59){
                this.segundo += 1;
            }else {
                this.segundo = 0;
                if(this.minuto < 59){
                    this.minuto += 1;
                }else{
                    this.minuto = 0;
                    if(this.hora < 23){
                        this.hora += 1;
                    }else{
                        this.hora = 0;
                    }
                }
            }
        }

        System.out.println(horarioAtual());
    }

    @Override
    public void decrementar(){
        if(this.centesimo > 0){
            this.centesimo --;
        }else if(this.segundo > 0){
            this.centesimo = 99;
            this.segundo --;
        }else if(this.minuto > 0){
            this.centesimo = 99;
            this.segundo = 59;
            this.minuto --;
        }else if(this.hora > 0){
            this.centesimo = 99;
            this.segundo = 59;
            this.minuto = 59;
            this.hora --;
        }else{
            this.centesimo = 99;
            this.segundo = 59;
            this.minuto = 59;
            this.hora = 23;
        }
        System.out.println(horarioAtual());
    }

    @Override
    public String horarioAtual(){
        return (this.hora + ":" + this.minuto + ":" + this.segundo + ":" + this.centesimo);
}


    public void setCentesimo(int centesimo){
        this.centesimo = centesimo;
    }


    public int getCentesimo(){
        return this.centesimo;
    }
}
