
public class Exercicio02 {

	public static void main(String[] args) {
		
		System.out.println("----- Estrutura For -----");
		for(int c = 1; c <= 100; c++) {
			System.out.printf("%d \n", c);
		}
		
		System.out.println("----- Estrutura While -----");
		int cont = 1;
		while(cont <= 100) {
			System.out.printf("%d \n", cont);
			cont++;
		}
		
		System.out.println("----- EStrutura do While -----");
		int contador = 1;
		do {
			System.out.printf("%d \n", contador);
			contador++;
		}while(contador <= 100);
	}
}
