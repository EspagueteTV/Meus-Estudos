/*
 * Autor:Gabriel siqueira
 * Fa�a um algoritmo que efetue a apresenta��o do valor da convers�o em d�lar ($)
de um valor lido em real (R$). Considere o valor do d�lar hoje. O programa dever�
solicitar o valor da cota��o do d�lar e tamb�m a quantidade de reais dispon�vel
com o usu�rio.
 */


programa
{

	real dolar, reais, convers

	
	funcao inicio()
	{
		escreva("Digite o valor do Dolar do dia de Hoje: ")
		leia(dolar)
		escreva("Digite o valor de Reais que Voc� quer Converter: ")
		leia(reais)

		convers=reais*dolar

		escreva("O valor da Convers�o de Reais em Dolar foi: ",convers," dolares")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 607; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */