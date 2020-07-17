/*
 * Autor: Gabriel Siqueira
 *  Elabore um programa para calcular a área de um círculo (const real pi = 3.1415). 
 *  
  */


programa
{
	
real raio,  area , aux
const real pi=3.1416
	
	funcao inicio()
	
	{
		escreva("Digite o Raio:  ")
		leia(raio)

		
		aux=raio*raio
		area=pi*aux

		escreva("A área do Circulo é: " ,area)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 332; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */