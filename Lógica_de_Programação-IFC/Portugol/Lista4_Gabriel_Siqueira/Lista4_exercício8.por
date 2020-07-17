programa
{
	
	funcao inicio()
	{
		real n_pecas_produzidas , n_pecas_defeituosas, resul
		
		
		escreva("Digite o número de peças produzidas: ")
		leia(n_pecas_produzidas)
	
		escreva("Digite o número de peças com defeito: ")
		leia(n_pecas_defeituosas)
		
		resul= ((n_pecas_defeituosas/n_pecas_produzidas)*100)
		
	
			se(resul>10){
				escreva("A Máquina precisa de Manutenção")
			}
	
				senao{
					escreva("A Máquina Não precisa de Manutenção")
				}
	
	
	
	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 463; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */