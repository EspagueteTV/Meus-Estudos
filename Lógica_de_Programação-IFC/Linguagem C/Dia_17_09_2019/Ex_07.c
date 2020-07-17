#include <stdio.h>

	int main(){
		
		int X, soma=0, cont=0, opcao=0;
		float media;	
		
		while(opcao != -1){
			printf("Digite um numero inteiro: ");
				scanf("%i", &X);
				
				soma= soma + X;
				cont++;
			printf("Para finalizar aperte '-1', senao aperte qualque numero: ");
				scanf("%i", &opcao);
		}
			media= soma/cont;
			printf("O resultado da soma eh: %i \n", soma);
			printf("O resultado da media eh: %.2f \n", media);
			
			system("pause");
		return 0;
	}
