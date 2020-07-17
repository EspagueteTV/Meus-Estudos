programa
{
	
	funcao inicio()
	{

	inteiro mes, t1, t2, t3, t4
	
		escreva("1) Janeiro \n")
		escreva("2) Fevereiro \n")
		escreva("3) Março\n")
		escreva("4) Abril \n")
		escreva("5) Maio \n")
		escreva("6) Junho \n")
		escreva("7) Julho \n")
		escreva("8) Agosto \n")
		escreva("9) Setembro \n")
		escreva("10) Outubro \n")
		escreva("11) Novembro \n")
		escreva("12) Dezembro \n\n")


		escreva("Digite o número que representa o mês atual: ")
		leia(mes)

		limpa()
			se(mes == 1 ou mes == 2 ou mes == 3){
				escreva("1º Trimestre")
			}
			senao se(mes==4 ou mes==5 ou mes==6){
				escreva("2º Trimestre ")
			}
			senao se(mes==7 ou mes==8 ou mes==9){
				escreva("3º Trimestre")
			}
			senao se(mes==10 ou mes==11 ou mes== 12){
				escreva("4º Trimestre")
			}

			senao{
				escreva("Codigo Inválido")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 624; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */