programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
		real a, p, r
		
		escreva("Digite um número: ")
		leia(a)

		se(a<0){
		p=Matematica.potencia(a, 2)
		escreva(" o resultado é: ",p)
		}
		
		se(a>0)
		
		escreva(" o resultado é: ",Matematica.raiz(a, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 274; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */