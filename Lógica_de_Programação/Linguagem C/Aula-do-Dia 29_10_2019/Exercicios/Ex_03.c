#include <stdio.h>

	int main(){
		
		int matriz[4][4];
		int i;
		int j;
		int cont=0;
		
		
//		Adicionar os numeros de 0 a 16 na matriz
		for(i=0; i<4; i++){
			for(j=0; j<4; j++){
				if(cont<16){
					matriz[i][j] = cont;
					cont++;
				}
			}
		}
		
//		Apresentar a matriz

	printf("Matriz\n");
		for(i=0; i<4; i++){
			for(j=0; j<4; j++){
				printf("%d \t ", matriz[i][j]);
			}
			printf("\n");
		}
		
		system("pause");
		return 0;
	}
