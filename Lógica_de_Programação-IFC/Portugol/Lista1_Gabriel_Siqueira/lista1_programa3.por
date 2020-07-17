/*
 * Autor:Gabriel Siqueira
 * Solicite ao usuário que informe dois valores inteiros e os armazene cada um em
uma variável (A, B). Esceva na tela os valores das variáveis (A,B) antes da troca.
Logo após, efetue a troca os valores contidos nas variáveis. Escreva na tela os
novos valores de (A, B) depois da troca. Dica: Para realizar a troca dos valores
contidos nas variáveis é necessário utilizar uma variável auxiliar (AUX) para
armazenar temporariamente o valor contido em A, caso contrário este valor será
perdido.
 */

programa
{

inteiro a, b, aux

	
	funcao inicio()
	{
		escreva("Digite o Primeiro Número: ")
		leia(a)
		escreva("Digite o Segundo Número: ")
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
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 839; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */