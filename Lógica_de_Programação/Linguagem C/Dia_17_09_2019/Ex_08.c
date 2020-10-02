#include <stdio.h>

	int main(){
		
		int X, QPares=0, QImpares=0, opcao=1;
		
			while(opcao != -1){
				printf("Digite um numero: ");
					scanf("%i", &X);
					
				if(X%2 == 0)
					QPares++;
					
					else
						QImpares++;
				
				printf("Para finalizar digite '-1', para continuar aperte outro numero: ");
					scanf("%i", &opcao);
			}
			printf("A quantidade de numeros Pares eh: %i \n",QPares);
			printf("A quantidade de numeros Impares eh: %i \n", QImpares);		
		
		return 0;
	}
