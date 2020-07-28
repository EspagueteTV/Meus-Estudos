/* Exercício 01
 * 
 * Faça um programa que determine os cinco primeiros múltiplos de 3, considerando números maiores que 0.
 * 
 * */


public class Exercicio01 {

	public static void main(String[] args) {
		
		int c = 1, mult;
		while(c <= 5) {
			mult = 3 * c;
			System.out.printf("%d \n", mult);
			c++;
		}
	}
}
