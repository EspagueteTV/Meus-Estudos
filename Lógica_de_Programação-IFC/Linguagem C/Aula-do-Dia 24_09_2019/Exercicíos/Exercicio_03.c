#include <stdio.h>

	int main(){
		
		int A[5], B[5], C[5], cont;
		
//		Inicialização do vetor A
		for(cont=0; cont<5; cont++){
			A[cont] = 0;
		}
		
//		Inicialização do vetor B
		for(cont=0; cont<5; cont++){
			B[cont] = 0;
		}
		
		//		Inicialização do vetor C
		for(cont=0; cont<5; cont++){
			C[cont] = 0;
		}
		
//		Selecionar os valores para A 
		for(cont=0; cont<5; cont++){
			printf("Digite um valor para o 'A': ");
				scanf("%i", &A[cont]);
		}
		
//		Selecionar os valores para B 
		for(cont=0; cont<5; cont++){
			printf("Digite um valor para o 'B': ");
				scanf("%i", &B[cont]);
		}
		
//		Alocar a soma dos Valores A e B na variavel vetor C
		for(cont=0; cont<5; cont++){
			C[cont] = A[cont] + B[cont];
		}
		
//		Apresentar os valores de A
		printf("\n------------Os valores de A------------\n");
		for(cont=0; cont<5; cont++){
			printf("%i \n", A[cont]);
		}
		
//		Apresentar os valores de B 
		printf("\n------------Os valores de B------------\n");
			for(cont=0; cont<5; cont++){
				printf("%i \n", B[cont]);
		}
		
//		Apresentar os valores de C
		printf("\n------------Os valores de C------------\n");
			for(cont=0; cont<5; cont++){
				printf("%i \n", C[cont]);
		}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		system("pause");
		return 0;
	}
