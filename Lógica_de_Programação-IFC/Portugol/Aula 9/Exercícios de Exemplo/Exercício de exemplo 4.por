programa
{
	
	funcao inicio()
	{
		real n1, n2, n3, media

		escreva("APROVADO OU REPROVADO\n")
		escreva("Digite a primeira nota:  ")
		leia(n1)
		escreva("Digite a segunda nota:  ")
		leia(n2)
		escreva("Digite a tercira nota:  ")
		leia(n3)

		media=((n1+n2+n3)/3)

		escreva("Sua m�dia �:  ", media)

		se (media>= 7.0) {
			escreva("\nAluno est� Aprovado ")
		}

		senao 
			escreva("\nAluno est� reprovado")

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 425; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */