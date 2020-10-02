#include <stdio.h>

	int main(){
		
		int A[5], B[5], C, cont;
		
//		Ler os valores de A
		for(cont=0; cont<5; cont++){
			printf("Digite o valor para %i: ", cont+1);
				scanf("%i", &A[cont]);
		}
//		Ler os valores de B
		for(cont=0; cont<5; cont++){
			printf("Digite o valor para %i: \n");
				scanf("%i", &B[cont]);
		}
		
		
		
		
		return 0;
	}
