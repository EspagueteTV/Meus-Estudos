import java.util.Scanner;

public class Exercicio08 {

	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		int num, maior=0, menor=0;
		
		for(int c = 0; c < 10; c++) {
			System.out.printf("Informe o %dº valor: ", c + 1);
				num = teclado.nextInt();
			if(c == 0) {
				maior = num;
				menor = num;
			}
			if(num > maior) {
				maior = num;
			}
			if(num < menor) {
				menor = num;
			}	
		}
		
		System.out.printf("O maior valor informado é %d \n", maior);
		System.out.printf("O menor valor informado é %d \n", menor);
		teclado.close();
	}
}
