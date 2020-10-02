#include <stdio.h>

	int main(){
		
		int V[5], cont;
		
//		Inicialização do vetor V
		for(cont=0; cont<5; cont++){
			V[cont] = 0;
		}
		
		for(cont=0; cont<5; cont++){
//			Leitura do valor para a variável V 
			printf("Digite um valor inteiro: ");
				scanf("%i", &V[cont]);
		}
		for(cont=0; cont<5; cont++){
//			Mostrar essa mensagem caso ele seja impar
			if(V[cont]%2 != 0){
				printf("O valor %i eh impar \n", V[cont]);
			}
		}
		
		system("pause");
		return 0;
	}
