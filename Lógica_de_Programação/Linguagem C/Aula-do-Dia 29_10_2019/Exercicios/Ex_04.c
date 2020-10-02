#include <stdio.h>

	int main(){
		
		int A[4][4];
		int B[4][4];
		int i, j;
		
//		Matriz A
		for(i=0;i<4; i++){
			for(j=0; j<4; j++){
				printf("Digite um numero para A [%d][%d]: ", i, j);
					scanf("%i",&A[i][j]);
					
					
			}
			printf("\n");
		}
		
		printf("\nMatriz B\n");
		for(i=0;i<4; i++){
			for(j=0; j<4; j++){
				printf("Digite um numero para B [%d][%d]: ", i, j);
					scanf("%i", &B[i][j]);
							
			}
			printf("\n");
		}
		
	//		Mostrar a Matriz
	printf("\nMatriz A \n");
		for(i=0; i<3; i++){
			for(j=0; j<4; j++){
				printf("\t%d ", A[i][j]);
			}
			printf("\t\t");
			for(j=0; j<4; j++){
				printf("\t%d", B[i][j]);
			}
			printf("\n");
		}	
		
		
		int aux;
	for(i=0; i<4; i++){
		for(j=0; j<4; j++){
			if(i==j){ // Elemento da principal digital
			 
			 aux= A[i][j]; 	// guarda o contudo de A
			A[i][j] = B[i][3-j];	// a recebe
			B[i][3-j] = aux;
		}
	}		
}
	
	
	//		Mostrar a Matriz
	printf("\nDepois da troca");
	//		Mostrar a Matriz
	printf("\nMatriz A \n");
		for(i=0; i<3; i++){
			for(j=0; j<4; j++){
				printf("\t%d ", A[i][j]);
			}
			printf("\t\t");
			for(j=0; j<4; j++){
				printf("\t%d", B[i][j]);
			}
			printf("\n");
		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
