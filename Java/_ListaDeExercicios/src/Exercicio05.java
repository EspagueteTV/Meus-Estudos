import java.util.Scanner;

public class Exercicio05 {

	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num, soma=0;
		for(int c = 0; c < 10; c++) {
			System.out.printf("Digite o %d valor: ", c+1);
				num = teclado.nextInt();
				soma += num;
		}
		System.out.printf("A soma de todos os valores digitados é %d", soma);
		
		teclado.close();
	}
}
