package br.com.siqueira.trabalho3trimestre.classe;

public class Despertador extends Relogio{

    protected int horaAlarme;
    protected int minutoAlarme;
    protected boolean ativo;

    public Despertador(){
        setHora(0);
        setMinuto(0);
        setSegundo(0);
    }

    public Despertador(int segundo, int minuto, int hora){
        super(hora, minuto, segundo);
    }

    public void horarioDespertador(int horaAlarme, int minutoAlarme){
        setHoraAlarme(horaAlarme);
        setMinutoAlarme(minutoAlarme);
    }

    public void ativarAlarme(){
        setAtivo(true);
    }

    public void desativarAlarme(){
        setAtivo(false);
    }

    @Override
    public void incrementar(){
        super.incrementar();
        if(this.ativo && this.hora == this.horaAlarme && this.minuto == this.minutoAlarme){
            System.out.println("Seu alarme foi aivado agora.   plin plin plin");
        }
        System.out.println(super.horarioAtual());
    }

    public void setHoraAlarme(int horaAlarme){
        this.horaAlarme = horaAlarme;
    }
    public void setMinutoAlarme(int minutoAlarme){
        this.minutoAlarme = minutoAlarme;
    }
    public void setAtivo(boolean ativo){
        this.ativo = ativo;
    }
    public int getHoraAlarme(){
        return this.horaAlarme;
    }
    public int getMinutoAlarme(){
        return this.minutoAlarme;
    }
    public boolean getAtivo(){
        return this.ativo;
    }

}
