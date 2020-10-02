#include <stdio.h>

	int main(){
		
		int matriz[5][5];
		int i, j;
		
		for(i=0; i<5; i++){
			
//		Laço para as colunas
			for(j=0; j<5; j++){
				matriz[i][j] = 0;
			}
		}
		
		
		
		for(i=0;i<5; i++){
			for(j=0; j<5; j++){
				
				
				
				if(i == j){
					matriz[i][j] = 6;
				}
				else{
					matriz[i][j] = 1;
				}
			}
		}
//		Mostrar a Matriz
	printf("\nMatriz\n");
		for(i=0; i<5; i++){
			for(j=0; j<5; j++){
				printf("%d \t", matriz[i][j]);
			}
			printf("\n");
		}		
		
		return 0;
	}
