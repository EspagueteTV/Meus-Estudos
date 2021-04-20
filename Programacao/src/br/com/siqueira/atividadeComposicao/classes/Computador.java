package br.com.siqueira.atividadeComposicao.classes;

public class Computador {
    private CPU cpu;
    private Monitor monitor;
    private Mouse mouse;
    private Teclado teclado;
    private HD[] hds;

    public Computador(){
        setCpu(null);
        setMonitor(null);
        setMouse(null);
        setTeclado(null);
        hds = new HD[3];
    }

    public void mostrar(){
        linha();
        System.out.println("\t\t\t\t Computador \t");
        linha();
        System.out.println("CPU -> " + getCpu());
        System.out.println("Monitor -> " + getMonitor());
        System.out.println("Teclado ->  " + getTeclado());
        System.out.println("Mouse -> " + getMouse());
        linha();
        System.out.println("HDs");
            for(int i = 0; i < hds.length; i++){
                if(getHds(i) != null){
                    System.out.println("\t HD " + i + " -> " + getHds(i));
                }
            }
        linha();
    }

    public void linha(){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public void setHds(HD hd, int posicao){
        this.hds[posicao] = hd;
    }

    public HD getHds(int posicao){
        return this.hds[posicao];
    }
}
