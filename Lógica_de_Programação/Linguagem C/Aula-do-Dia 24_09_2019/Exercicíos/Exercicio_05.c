#include <stdio.h>

	int main(){
		
		int V[5], cont;
		
//		Inicialização do vetor V
		for(cont=0; cont<5; cont++){
			V[cont] = 0;
		}
		
//		Obter os valores de V
		for(cont=0; cont<5; cont++){
			printf("Digite um valor: ");
				scanf("%i", &V[cont]);
		}
		
//		Mostrar os valores na ordem que foram digitados
		printf("------- Os valores na ordem que foram digitados -------");
		for(cont=0; cont<5; cont++){
			printf("\n %i", V[cont]);
		}
		
//		Mostrar os valores na ordem inversa em que foram digitados
		printf("\n------- Os valores na ordem inversa do que foram digitados -------");
		for(cont=4; cont>= 0; cont--){
			printf("\n %i ", V[cont]);
		}
		
		return 0;
	}
