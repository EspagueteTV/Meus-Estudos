/*
 * Autor:Gabriel siqueira
 * Faça um algoritmo que efetue a apresentação do valor da conversão em dólar ($)
de um valor lido em real (R$). Considere o valor do dólar hoje. O programa deverá
solicitar o valor da cotação do dólar e também a quantidade de reais disponível
com o usuário.
 */


programa
{

	real dolar, reais, convers

	
	funcao inicio()
	{
		escreva("Digite o valor do Dolar do dia de Hoje: ")
		leia(dolar)
		escreva("Digite o valor de Reais que Você quer Converter: ")
		leia(reais)

		convers=reais*dolar

		escreva("O valor da Conversão de Reais em Dolar foi: ",convers," dolares")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 607; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */