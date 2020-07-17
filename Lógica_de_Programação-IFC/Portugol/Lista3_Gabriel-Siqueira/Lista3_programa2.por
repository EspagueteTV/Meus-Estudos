programa
{
	
	funcao inicio()

	{
	cadeia nome
	real n1, n2, n3,n4, media, aux

	escreva("Digite o Nome do Aluno: ")
	leia(nome)

	escreva("Digite a Primeira Nota:  ")
	leia(n1)

	escreva("Digite a Segunda Nota:  ")
	leia(n2)

	escreva("Digite a Terceira Nota:  ")
	leia(n3)

	escreva("Digite a Quarta Nota:  ")
	leia(n4)

	aux=n1+n2+n3+n4
	media=aux/4

	escreva("A Média do aluno ",nome, " foi:  ",media)


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 415; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */