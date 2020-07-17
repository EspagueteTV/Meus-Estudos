programa
{
	
	funcao inicio()
	{

	inteiro opcao
		
		escreva("1) Domingo \n")
		escreva("2) Segunda \n")
		escreva("3) Terça \n")
		
		escreva("4) Quarta \n")
		escreva("5) Quinta \n")
		escreva("6) Sexta \n")
		
		escreva("7) Sábado \n")
		escreva("8) Sair \n")

		escreva("Escolha uma opção que representa o mês escolhido: ")
		leia(opcao)

		limpa()

		escolha (opcao)
		{
			caso 1: 
		 		escreva ("Domingo")
		 		pare   
		 	caso 2: 
		 		escreva ("Segunda Feira")
		 		pare  
		 	caso 3: 
		 		escreva ("Terça Feira")
		 		pare
		 	
		 	caso 4: 
		 		escreva ("quarta Feira")
		 		pare  
		 	caso 5: 
		 		escreva ("Quinta Feira")
		 		pare   
		 	caso 6: 
		 		escreva ("sexta Feira")
		 		pare
		 		
		 	caso 7: 
		 		escreva ("Sábado")
		 		pare  
		 	caso 8: 
		 		escreva ("Tchau !")
		 		pare   
		

			caso contrario: 
				escreva("Código Inválido") 
			
		}















		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 135; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */