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
		escreva ("M�dia = ", media, " Situa��o = Aprovado")
}
	se (media < 7.0) {
	escreva ("M�dia = ", media, " Situa��o = Reprovado")
}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta se��o do arquivo guarda informa��es do Portugol Studio.
 * Voc� pode apag�-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 256; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */