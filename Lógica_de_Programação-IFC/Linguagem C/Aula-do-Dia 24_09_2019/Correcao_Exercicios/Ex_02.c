#include <stdio.h>

	int main(){
		
//		Criar valores pré-definidos
		int vetor[5] = {2, 4, 6, 8, 10};

//		Calcular a soma dos valores
		int soma = 0;
		int i;
		
		for(i=0; i<5; i++){
			soma = soma + vetor[i];
		}
		
//		Imprimir a soma dos valores
		printf("\nA soma dos valores: %d", soma);
		
		system("pause");
		return 0;
	}
