#include <stdio.h>

	int main(){
		
// 		Declaração de vetor
		int vetor[10], i;
		
//		Inicialização de vetores
		for(i=0; i<10; i++){
			vetor[i] = 0;
		}
		
//		Leitura de dados para o vetor
		for(i=0; i<10; i++){
			printf("Digite um elemento %d: ", i);
				scanf("%i", &vetor[i]);
		}
		
//		Escrita de dados de um vetor
		for(i=0; i<10; i++){
			printf("[%d]: %d \n", i, vetor[i]);
		}
				
		
		system("pause");
		return 0;
	}	
