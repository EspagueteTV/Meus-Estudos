programa
{
	
	funcao inicio()
	{
		
		caracter letra
		
		
		
		escreva("Se você é Solteiro(a) Digite: S.\nSe você e Casado(a) Digite: C.\nSe você e Divorciado(a) Digite: D.\nSe você e Viuvo Digite: V\n:")
		leia(letra)

			
			se (letra == 's' ou letra == 'S'){
				escreva("Você é Solteiro(a)")
			}
				senao se(letra == 'c' ou letra == 'C'){
				escreva("Você é Casado(a)")
				}
				senao se(letra == 'd' ou letra == 'D'){
				escreva("Você é Divorciado(a)")
				}
				senao se(letra == 'v' ou letra == 'V'){
				escreva("Você é Viuvo(a)")
				}
	
				senao{
					escreva("Estado civil inválido")	
				}
			
			
			
			

			

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 601; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */