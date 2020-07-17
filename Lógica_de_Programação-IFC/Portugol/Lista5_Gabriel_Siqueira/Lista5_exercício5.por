programa
{
	
	funcao inicio()
	{
	
		inteiro ano
		real div1, div2, div3
		
		
		
		escreva("Digite o ano atual: ")
		leia(ano)
	
		div1=(ano%400)
		div2=(ano%4)
		div3=(ano%100)
			
			
			se(div1==0){
				escreva("Ano Bissexto")
			}
			
			senao se(div2==0){
				escreva("Ano Bissexto")
			}

			senao se(div3==0){
				escreva("Não é ano Bissexto")
			}



			senao
				escreva("Não é Ano Bissexto")
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 232; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {div1, 8, 7, 4}-{div2, 8, 13, 4}-{div3, 8, 19, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */