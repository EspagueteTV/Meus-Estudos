
public class TesteCalculadora {

	public static void main(String[] args) {
		
	// Declaração da variável para o objeto
		Calculadora calc;
		
	// Instânciação do Objeto: operador new
		calc = new Calculadora();
		
		calc.parcela1 = 3;
		calc.parcela2 = 5;
		calc.somar();
		System.out.printf("Resultado = %d \n", calc.soma);
		
		
		
		
	}
}
