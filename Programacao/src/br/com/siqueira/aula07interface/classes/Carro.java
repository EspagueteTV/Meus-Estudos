package br.com.siqueira.aula07interface.classes;

public class Carro implements Veiculo, Motor{

    @Override
    public void getModelo() {
        System.out.println("Opala");
    }

    @Override
    public void getFabricante() {
        System.out.println("1978");
    }

    @Override /* Reescrever */
    public void getNome() {
        System.out.println("8v");
    }

    @Override
    public void getId() {
        System.out.println("Chevrolet");
    }
}
