package br.com.siqueira.avaliacao3trimeste;

public class Abc {
    private int x;
    private String y;

    public Abc(){
        setX(0);
        setY("Indefinido");
    }

    public Abc(int x, String y) {
        setX(x);
        setY(y);
    }

    public void setX(int x){
        this.x = x;
    }
    public void setY(String y){
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public String getY(){
        return this.y;
    }
}
