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

		escreva("Sua média é:  ", media)

		se (media>= 7.0) {
			escreva("\nAluno está Aprovado ")
		}

		senao 
			escreva("\nAluno está reprovado")

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 425; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */