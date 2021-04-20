package br.com.siqueira.avaliacao3trimeste;

public class Teste {
    public static void main(String[] args){
        //Criação do Objeto
        Xyz o1 = new Xyz();

        //Preenchimento dos valores
        o1.setX(4);
        o1.setY("Março");
        o1.setZ(20.21);

        //Mostrar os valores
        System.out.println("Valor de x: " + o1.getX());
        System.out.println("Valor de y: " + o1.getY());
        System.out.println("Valor de z: " + o1.getZ());
    }
}
