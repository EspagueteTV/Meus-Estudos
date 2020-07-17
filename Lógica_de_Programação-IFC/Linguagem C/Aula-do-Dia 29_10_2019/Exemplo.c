#include <stdio.h>

	int main(){
		
//		Declara matriz inteira
		int matriz[3][4];	
		
//		Incializar a matriz
		int i; // Indice de linha
		int j; // Indice de Coluna
		
//		Laço para as linhas
		for(i=0; i<3; i++){
			
//		Laço para as colunas
			for(j=0; j<4; j++){
				matriz[i][j] = 0;
				printf("\nInicializando linha %d, coluna %d ", i, j);
			}
		}
		

		
//		Ler a Matriz 
		printf("Digite a matriz: \n");
		for(i=0; i<3; i++){
			for(j=0; j<4; j++){
				printf("\nMatriz [%d] [%d]: ", i, j);
					scanf("%d", &matriz[i][j]);
			}
		}
		
//		Mostrar a Matriz
	printf("\nMatriz\n");
		for(i=0; i<3; i++){
			for(j=0; j<4; j++){
				printf("%d \t", matriz[i][j]);
			}
			printf("\n");
		}		
		system("pause");
		return 0;
	}
