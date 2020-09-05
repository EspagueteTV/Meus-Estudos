package br.com.siqueira.treinamento.Vetores;
import java.util.Scanner;
public class Treino01 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int a[] = {1, 0, 5, -2, -5, 7};
        int soma;

        // A soma entre os valores das posições a[0], a[1] e a[5]
        soma = a[0] + a[1] + a[5];
        System.out.printf("O valor da variável soma é %d \n", soma);

        // Modifocar o valor na posição 4, atribuindo valor 100
        a[4] = 100;

        for(int v:a){
            System.out.printf("%d ", v);
        }



        teclado.close();
    }
}
