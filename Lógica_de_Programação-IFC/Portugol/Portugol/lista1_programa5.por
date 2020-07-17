/*
 * Autor: Gabriel Siqueira
 * Faça um algoritmo para ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.  
 * Obs.: Fahrenheit = (9 * Celsius + 160)/5 
 */


programa
{
	
	funcao inicio()
	{
   real cels, fahrenheit

	
		escreva("Digite a Temperatura em graus Celsius a ser convertido: ")
		leia(cels)

		fahrenheit=(9 * cels + 160)/5

		escreva("A Temperatura em graus Celsius convertida ficou em: " ,fahrenheit , " graus Fahrenheit")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 483; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */