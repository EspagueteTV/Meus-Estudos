package br.com.siqueira.avaliacao3trimeste;

public class Xyz extends Abc{
    private double z;

    public Xyz(){
        super();
        setZ(0);
    }
    public Xyz(int x, String y, double z){
        super(x, y);
        setZ(z);
    }

    public void setZ(double z){
        this.z = z;
    }

    public double getZ(){
        return this.z;
    }
}
