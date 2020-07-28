import java.util.Scanner;

public class Exercicio09 {

	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num, cont=0, c=1;
		
		System.out.print("Digite um valor Inteiro: ");
			num = teclado.nextInt();
			
		while(cont < num) {
			if(c % 2 == 1) {
				System.out.printf("%d -> ", c);
				cont++;
			}
			c++;
		}
		System.out.println("FIM!");
		teclado.close();
	}
}
