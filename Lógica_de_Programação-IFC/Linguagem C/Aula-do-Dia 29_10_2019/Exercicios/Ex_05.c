#include <stdio.h>
#include <stdlib.h>

	int main(){
		
		char matriz[5][4];
		int alu[5];
		int i, j;
		float soma[5];
		
		for(i=0; i<5; i++){
			soma[i] = 0;
		}
				
		
//		Adquirir as notas dos aluno 
		for(i=0; i<5; i++){
			printf("\n\nResposta do aluno: %d \n", i);
			for(j=0; j<4; j++){
				printf("Digite a alternativa do aluno: ");
					scanf("%c", &matriz[i][j]);
				fflush(stdin);
			}
		}
		
//		Adicionar a correção das notas 
		for(i=0; i<5; i++){
			for(j=0; j<4; j++){
				
				if( matriz[i][0] == 'a'){
					soma[i] = soma[i] + 2.5;
				}
				if( matriz[i][1] == 'c'){
					soma[i] = soma[i] + 2.5;
				}
				if( matriz[i][2] == 'a'){
					soma[i] = soma[i] + 2.5;
				}
				if( matriz[i][3] == 'c'){
					soma[i] =soma[i] + 2.5;
				}	
			}
		}
		
//		MOstrar as notas

	for(i=0; i<5; i++){
		printf("\n Media do aluno %i = %.2f", i, (soma[i] / 4));
	}
		
		
		
		
		system("pause");
		return 0;
	}
