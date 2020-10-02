programa
{
	inclua biblioteca Matematica  --> mat
	funcao inicio()
	{
  real peso1, altura1 , Imc

escreva("Digite seu peso: ")
leia(peso1)
escreva("Digite sua altura:   ")
leia(altura1)

Imc= (peso1) / (altura1*altura1)

escreva("\nO Seu Imc é: ", mat.arredondar(Imc, 2), " m/cm²\n")

	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 297; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */