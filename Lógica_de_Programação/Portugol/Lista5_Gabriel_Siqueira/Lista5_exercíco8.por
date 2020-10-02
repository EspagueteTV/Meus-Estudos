programa
{
	
	funcao inicio()
	{

	inteiro dia


		escreva("1) Domingo \n")
		escreva("2) Segunda \n")
		escreva("3) Terça\n")
		escreva("4) Quarta \n")
		escreva("5) Quinta\n")
		escreva("6) Sexta \n")
		escreva("7) Sábado \n \n")
		


		escreva("Digite o número que representa o dia de semana escolhido: ")
		leia(dia)

		limpa()
			se(dia==1 ou dia==01){
				escreva("Domingo")
			}
			senao se(dia==2 ou dia==02){
				escreva("Segunda Feira ")
			}
			senao se(dia==3 ou dia==03){
				escreva("Terça-Feira")
			}
			senao se(dia==4 ou dia==04){
				escreva("Quarta-Feira")
			}
			senao se(dia==5 ou dia==05){
				escreva("Quinta-Feira")
			}
			senao se(dia==6 ou dia==06){
				escreva("Sexta-Feira")
			}
			senao se(dia==7 ou dia==07){
				escreva("Sábado")
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
 * @POSICAO-CURSOR = 239; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */