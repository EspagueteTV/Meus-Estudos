/*
 * Autor: Gabriel Siqueira
 *  Elabore um programa para calcular a área de um círculo (const real pi = 3.1415). 
 *  
  */


programa
{
	
real raio, pi= 3.1415, area , aux
caracter m 
cadeia cm , unid
	
	funcao inicio()
	
	{
		escreva("Digite o Raio do Círculo:  ")
		leia(raio)

		escreva("Se a sua Unidade de Medida é Metros digite: m \nSe a sua Unidade de Medida e Centímetros digite: cm \n =")
		leia(unid)
		
		aux=raio*raio
		area=pi*aux

		escreva("A área do Circulo é: " ,area ,unid, "²")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 512; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */