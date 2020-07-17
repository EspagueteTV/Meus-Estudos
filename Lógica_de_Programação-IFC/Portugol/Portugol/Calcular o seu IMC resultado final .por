programa
{
	inclua biblioteca Matematica  --> mat
	funcao inicio()
	{
  real peso1, altura1 , Imc
  cadeia nome


escreva("Digite seu Nome:      ")
  leia(nome)
escreva("Digite seu Peso: ")
leia(peso1)
escreva("Digite sua Altura:   ")
leia(altura1)

Imc= (peso1) / (altura1*altura1)

escreva("\nO Seu Imc é: ", mat.arredondar(Imc, 2), " m/cm²\n")

	se (Imc > 25)
		{
			escreva("Você ",  (nome) ," está Acima do Peso (\n")
		}
		senao 
		{
			escreva("Você ", (nome), " está no Peso Ideal \n")
	}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 428; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */