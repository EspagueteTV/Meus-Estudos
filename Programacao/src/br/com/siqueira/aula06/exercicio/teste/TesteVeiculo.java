package br.com.siqueira.aula06.exercicio.teste;

import br.com.siqueira.aula06.exercicio.classes.Veiculo;

public class TesteVeiculo {
    public static void main(String[] args){

        Veiculo veiculo = new Veiculo();

        veiculo.setModelo("Fiat Tempra");
        veiculo.setPlaca("ABC1234");
        veiculo.setNr_passageiros(5);
        veiculo.setConsumo_medio(9);

        System.out.println("-=-= Dados do Veículo -=-=");
        System.out.printf("Modelo: %s \n", veiculo.getModelo());
        System.out.printf("Placa: %s \n", veiculo.getPlaca());
        System.out.printf("Número de Passageiros: %d pessoas \n", veiculo.getNr_passageiros());
        System.out.printf("Consumo médio: %.2f Km/l \n", veiculo.getConsumo_medio());
    }
}
