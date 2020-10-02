
/*
 *Solicite ao usuario que digite dois números. Logo após, calcule e exiba: a) A somaentre os números; b) A subtração entre os números; c) A multiplicação entre os números; d) A divisão entre os números. 
 *Autor:Gabriel Siqueira
 */

programa
{
	
	funcao inicio()
	{

  real n1, n2, soma, subtracao, multiplicacao, divisao

	escreva("Digite o Primeiro Número: ")
	leia(n1)
	escreva("Digite o Segundo Número: ")
	leia(n2)

     soma=n1+n2
     subtracao=n1-n2
     multiplicacao=n1*n2
     divisao=n1/n2
     
     
     
     escreva("O Resultado das Operações são:\n Soma: " ,soma, " \n Subtração: " ,subtracao, " \n Divisão: " ,divisao, " \n Multiplicação: " ,multiplicacao ) 
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 281; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */