#include <stdio.h>
#include <locale.h>

	int main(){
		
		setlocale(LC_ALL, "portuguese");
		
//		Criar um vetor A com 10 elementos inteiros
		int A[10];
		int cont, soma=0, quant_imp=0;
		float media;
		
//		Leitura dos valores informados pelo usu�rio
		for(cont=0; cont<10; cont++){
			printf("Digite o valor %i: ", cont);
				scanf("%i", &A[cont]);
		}

//		Identificar quis valores digitados s�o �mpares e somar em uma vari�vel simples e contar
		for(cont=0; cont<10; cont++){
			
			if(A[cont]%2 != 0){
				soma= soma + A[cont];
				quant_imp++;
			}
		}

//		Calcular a m�dia dos elementos impares
		media= soma/quant_imp;
		
		printf("A media dos n�meros �mpares foi: %.2f \n", media);
		
		system("pause");
		return 0;
	}
