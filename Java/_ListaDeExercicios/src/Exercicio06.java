import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num;
		double media, soma=0;
		
		for(int c = 0; c < 10; c++) {
			System.out.printf("Digite o %dº valor: ", c + 1);
				num = teclado.nextInt();
				soma += num;
		}
		
		media = soma/10;
		System.out.printf("A media de todos os valores digitados é %.2f \n", media);
		
		
		
		teclado.close();
	}
}
