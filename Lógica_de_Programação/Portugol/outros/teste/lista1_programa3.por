/*
 * Autor:Gabriel Siqueira
 * Solicite ao usu�rio que informe dois valores inteiros e os armazene cada um em
uma vari�vel (A, B). Esceva na tela os valores das vari�veis (A,B) antes da troca.
Logo ap�s, efetue a troca os valores contidos nas vari�veis. Escreva na tela os
novos valores de (A, B) depois da troca. Dica: Para realizar a troca dos valores
contidos nas vari�veis � necess�rio utilizar uma vari�vel auxiliar (AUX) para
armazenar temporariamente o valor contido em A, caso contr�rio este valor ser�
perdido.
 */

programa
{

inteiro a, b, aux

	
	funcao inicio()
	{
		escreva("Digite o Primeiro N�mero: ")
		leia(a)
		escreva("Digite o Segundo N�mero: ")
		leia(b)
		escreva("Valor antes da Troca: \n")
		escreva("A= ",a,"\nB= ",b )

	aux=a
	a=b
	b=aux

		escreva("\n Depois da troca : \n")
		escreva("A= ",a,"\nB= ",b)




		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 839; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */