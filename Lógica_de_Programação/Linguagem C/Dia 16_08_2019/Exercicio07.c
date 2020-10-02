#include <stdio.h>

	int main(){
		
		int cont, x, y, resul;
		cont=1;
		resul=0;
		
		printf("Digite um numero para ser multiplicado:  ");
			scanf("%i", &x);
		printf("Digite um numero para ser multiplicado por %i:  ", x);
			scanf("%i", &y);
			
			while(cont<=y){
				printf("%i \n", x);
				resul= resul + x;
				cont++;
			}
			printf("O resultado da soma eh: %i", resul);
		
		
		
		
		return 0;
	}
