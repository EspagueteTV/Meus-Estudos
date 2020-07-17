#include <stdio.h>

	int main(){
		
		int A[5], B[5], cont;
		
//		Inicialização do vetor A
		for(cont=0; cont<5; cont++){
			A[cont] = 0;
		}
		
//		Inicialização do vetor B
		for(cont=0; cont<5; cont++){
			B[cont] = 0;
		}
		
		
//		Leitura dos valores de A
		for(cont=0; cont<5; cont++){
			printf("Digite o valor %i: ", cont+1);
				scanf("%i", &A[cont]);
		}
		
//		Copia do A para o B
		for(cont=0; cont<5; cont++){
			B[cont] = A[cont];
		}
		
//		Mostra os valores de A
		printf("\nValores do Vetor A \n");
		for(cont=0; cont<5; cont++){
			printf("Valor [%i]: %i \n", cont+1, A[cont]);
		}
		
//		Mostra os valores de B
		printf("\nValores do Vetor B \n");
		for(cont=0; cont<5; cont++){
			printf("Valor [%i]: %i \n", cont+1, B[cont]);
		}
		
		
		return 0;
	}
