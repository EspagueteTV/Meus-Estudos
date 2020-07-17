programa
{
	
	funcao inicio()
	{
		real num1, num2, media
	escreva ("Nota 1: ")
	leia (num1)
	escreva ("Nota 2: ")
	leia (num2)
	
	media = (num1 + num2) / 2
		se (media >= 7.0) {
		escreva ("Média = ", media, " Situação = Aprovado")
}
	se (media < 7.0) {
	escreva ("Média = ", media, " Situação = Reprovado")
}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 256; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */