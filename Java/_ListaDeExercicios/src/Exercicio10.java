
public class Exercicio10 {

	public static void main(String args[]) {
		
		int soma=0, c=1, cont=0;
		
		while(cont < 50){
			if(c % 2 == 0) {
				soma += c;
				cont++;
			}
			c ++;
		}
		
		System.out.printf("A soma dos 50 primeiros números pares é %d \n", soma);
	}
}
