package exercicios;

public class CalculadoraTeste {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		calc.lerParcela1();
		calc.lerParcela2();
		calc.somar();
		System.out.printf("A soma dos valores � %.2f \n", calc.soma);
		calc.subtrair();
		System.out.printf("A subtra��o dos valores � %.2f \n", calc.diferenca);
		calc.multiplicar();
		System.out.printf("O produto dos valores � %.2f \n", calc.produto);
		calc.dividir();
		System.out.printf("O quociente dos valores � %.2f \n", calc.quociente);
		
		
	}
}
