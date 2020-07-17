/*
 *  Ler um valor inteiro que representa o mês de uma data e apresentar o
nome do mês (janeiro, fevereiro, ...
 */

programa
{
	
	funcao inicio()
	{
		inteiro mes

		escreva("Digite o número correspondente ao Mês desejado:  ")
		leia(mes)

		se(mes==1 ou mes==01){
			escreva("Janeiro")
		}
		senao se(mes==2 ou mes==02){
			escreva("Fevereiro")
		}
		senao se(mes==3 ou mes==03){
			escreva("Março")
		}
		senao se(mes==4 ou mes==04){
			escreva("Abril")
		}
		senao se(mes==5 ou mes==05){
			escreva("Maio")
		}
		senao se(mes==6 ou mes==06){
			escreva("Junho")
		}
		senao se(mes==7 ou mes==07){
			escreva("Julho")
		}
		senao se(mes==8 ou mes==08){
			escreva("Agosto")
		}
		senao se(mes==9 ou mes==09){
			escreva("Setembro")
		}
		senao se(mes==10){
			escreva("Outubro")
		}
		senao se(mes==11){
			escreva("Novembro")
		}
		senao se(mes==12){
			escreva("Dezembro")
		}

		senao{
			escreva("Número Invalido")
		}






	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 352; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */