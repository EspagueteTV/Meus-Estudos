#include <stdio.h>

	int main(){
		
		int matriz[3][4];
		int i;
		int j;
		
//		Ler a matriz digitada pelo usuário

		for(i=0; i<3; i++){
			for(j=0; j<4; j++){
				printf("Digite um numero para [%d][%d]: ",i , j);
					scanf("%i", &matriz[i][j]);
			}
		}
		
//		Multiplicar os elemntos pares por 3, e impares por 2;

		for(i=0; i<3; i++){
			for(j=0; j<4; j++){
				
				if(matriz[i][j]%2 == 0){	// Par
					matriz[i][j] = matriz[i][j] * 3;
				}
				else{
					matriz[i][j] = matriz[i][j] * 2;
				}	
			}
		}
		
		printf("\nMatriz\n");
		for(i=0; i<3; i++){
			for(j=0; j<4; j++){
				printf("%d \t", matriz[i][j]);
			}
			printf("\n");
		}		
		
		
		
		return 0;	
	}
