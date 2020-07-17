#include <stdio.h>

	int main(){
		
		int V[] = {1,3, 5, 7, 9}, N, cont, cont1=0;
		
//		Leitura do valor digitado pelo usuário
		printf("Digite um valor: ");
			scanf("%i", &N);
		
		for(cont=0; cont<5; cont++){
			
//		Mostrar se o valor for encontrado no Vetor
			if(N == V[cont]){
				printf("O valor %i foi encontrado dentro do vetor ! \n", N);
				cont1++;
			}
		}
		
//		Mensagem de notificação que ela não foi encontrado no vetor
			if( cont1 == 0)
				printf("O valor %i nao foi encontrado no vetor ! \n", N);
	
		system("pause");
		return 0;
	}
