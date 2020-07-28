import java.util.Scanner;

public class Exercicio07 {

	public static void main(String args[]) {
		
		int num, cont = 0;
		double soma = 0, media;
		Scanner teclado = new Scanner(System.in);
		
		for(int c = 0; c < 10; c++) {
			System.out.printf("Informe o %dº valor: ", c + 1);
				num = teclado.nextInt();
				
			if(num > 0) {
				soma += num;
				cont++;
			}
		}
		media = soma/cont;
		System.out.printf("A média dos %d números positivos informados é %.2f ", cont, media);
		teclado.close();
	}
}
