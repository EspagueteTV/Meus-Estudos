package exercicios;

import java.util.Scanner;

public class CalculadoraV2 {

	Scanner teclado = new Scanner(System.in);
	
	// ----- Atributos -----
		double parcela1;
		double parcela2;
		double soma;
		double diferenca;
		double produto;
		double quociente;
		
	// ----- M�todos -----
		
		public void lerParcela1() {
			System.out.print("Digite o valor da 1� Parcela: ");
				parcela1 = teclado.nextDouble();
		}
		
		public void lerParcela2() {
			System.out.print("Digite o valor da 2� Parcela: ");
				parcela2 = teclado.nextDouble();
		}
		
		public void somar() {
			this.soma = parcela1 + parcela2;
		}
		
		public void subtrair() {
			this.diferenca = parcela1 - parcela2;
		}
		
		public void multiplicar() {
			this.produto = parcela1 * parcela2;
		}
		
		public void dividir() {
			this.quociente = parcela1 / parcela2; 
		}
		
		public void lerDuasParcelas() {
			lerParcela1();
			lerParcela2();
		}
		
		public void mostraResultadoOperacoesBasicas() {
			System.out.println("-=-=- Apresenta��o dos Dados Obtidos -=-=-");
			somar();
			System.out.printf("A soma dos valores � %.2f \n", soma);
			subtrair();
			System.out.printf("A subtra��o dos valores � %.2f \n", diferenca);
			multiplicar();
			System.out.printf("O produto dos valores � %.2f \n", produto);
			dividir();
			System.out.printf("O quociente dos valores � %.2f \n", quociente);
		}
}
