
/*
 *Solicite ao usuario que digite dois n�meros. Logo ap�s, calcule e exiba: a) A somaentre os n�meros; b) A subtra��o entre os n�meros; c) A multiplica��o entre os n�meros; d) A divis�o entre os n�meros. 
 *Autor:Gabriel Siqueira
 */

programa
{
	
	funcao inicio()
	{

  real n1, n2, soma, subtracao, multiplicacao, divisao

	escreva("Digite o Primeiro N�mero: ")
	leia(n1)
	escreva("Digite o Segundo N�mero: ")
	leia(n2)

     soma=n1+n2
     subtracao=n1-n2
     multiplicacao=n1*n2
     divisao=n1/n2
     
     
     
     escreva("O Resultado das Opera��es s�o:\n Soma: " ,soma, " \n Subtra��o: " ,subtracao, " \n Divis�o: " ,divisao, " \n Multiplica��o: " ,multiplicacao ) 
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 281; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */