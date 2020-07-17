
/* CLIQUE NO SINAL DE "+", À ESQUERDA, PARA EXIBIR A DESCRIÇÃO DO EXEMPLO
 *  
 * Copyright (C) 2014 - UNIVALI - Universidade do Vale do Itajaí
 * 
 * Este arquivo de código fonte é livre para utilização, cópia e/ou modificação
 * desde que este cabeçalho, contendo os direitos autorais e a descrição do programa, 
 * seja mantido.
 * 
 * Se tiver dificuldade em compreender este exemplo, acesse as vídeoaulas do Portugol 
 * Studio para auxiliá-lo:
 * 
 * https://www.youtube.com/watch?v=K02TnB3IGnQ&list=PLb9yvNDCid3jQAEbNoPHtPR0SWwmRSM-t
 * 
 * Descrição:
 * 
 * 	Este exemplo ilustra o uso da instrução "escolha". Para isso, o programa pede
 * 	ao usuário que escolha uma opção e exibe uma frase correspondente à opção
 * 	escolhida.
 * 
 * Autores:
 * 
 * 	Giordana Maria da Costa Valle
 * 	Carlos Alexandre Krueger
 * 	
 * Data: 01/06/2013
 */

programa
{
	funcao inicio()
	{
		inteiro opcao
		
		escreva("1) Janeiro \n")
		escreva("2) Fevereiro \n")
		escreva("3) Março \n")
		
		escreva("4) Abril \n")
		escreva("5) Maio \n")
		escreva("6) Junho \n")
		
		escreva("7) Julho \n")
		escreva("8) Agosto \n")
		escreva("9) Setembro \n")
		
		escreva("10) Outubro\n")
		escreva("11) Novembro \n")
		escreva("12) Dezembro  \n")

		escreva("13) Sair \n\n")



		

		escreva("Escolha uma opção que representa o mês escolhido: ")
		leia(opcao)

		limpa()

		escolha (opcao)	
		{
			caso 1: 
		 		escreva ("Janeiro")
		 		pare   
		 	caso 2: 
		 		escreva ("Fevereiro")
		 		pare  
		 	caso 3: 
		 		escreva ("Março")
		 		pare
		 	
		 	caso 4: 
		 		escreva ("Abril")
		 		pare  
		 	caso 5: 
		 		escreva ("Maio")
		 		pare   
		 	caso 6: 
		 		escreva ("Junho")
		 		pare
		 		
		 	caso 7: 
		 		escreva ("Julho")
		 		pare  
		 	caso 8: 
		 		escreva ("Agosto")
		 		pare   
		 	caso 9: 
		 		escreva ("Setembro")
		 		pare
		 	
		 	caso 10: 
		 		escreva ("Outubro")
		 		pare   
		 	caso 11: 
		 		escreva ("Novembro")
		 		pare  
		 	caso 12: 
		 		escreva ("Dezembro")
		 		pare
		 	caso 13: 
		 		escreva("Tchau!")
		 	
		 	caso contrario: 
		 		escreva ("Opção Inválida !")
		}

		escreva("\n")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1260; 
 * @DOBRAMENTO-CODIGO = [1];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */