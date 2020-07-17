#include <stdio.h>

	int main(){
		
//		Ler 5 valores para o vetor A

		int A[5];	// vetor A com 5 valores
		int i;

			for(i=0; i<5; i++){
				printf("A[%d]:  ", i);
					scanf("%d", &A[i]);
			}
		
//		Copiar o vetor A para o vetro B
			int B[5];
		
			for(i=0; i<5; i++){
				B[i] = A[i];
			}
		
//		Apresentar o vetor A
			printf("\nVetor A: ");
			
			for(i=0; i<5; i++){
				printf("%d \t", A[i]);
			}

// Apresentar o vetor B
			printf("\nVetor B: ");
			for(i=4; i<-1; i++){
				printf("%d \t", B[i]);
			}
		
		
		return 0;
	}
