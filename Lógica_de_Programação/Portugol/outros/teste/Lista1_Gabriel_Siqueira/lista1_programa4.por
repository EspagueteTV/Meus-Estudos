/*
 * Autor:Gabriel siqueira
 * Faça um algoritmo que efetue a apresentação do valor da conversão em dólar ($)
de um valor lido em real (R$). Considere o valor do dólar hoje. O programa deverá
solicitar o valor da cotação do dólar e também a quantidade de reais disponível
com o usuário.
 */


programa
{

	

	
	funcao inicio()
	{
		real dolar ,reais, cotacao_dolar

		escreva("Qual a quantidade de R$ você tem : ")
		leia(reais)

		escreva("Qual o valor do dolar hoje:   ")
		leia(cotacao_dolar)

		dolar=reais/cotacao_dolar

		escreva("O seu valor em dolar é: ",dolar)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 307; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */