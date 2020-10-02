/* Exercicio 1 Temperatura */
#include <stdio.h>
	
	int main(){
		
		float temp;
		
		printf("Digite a Temperatura da Agua:  ");
			scanf("%f", &temp);
		
		if(temp<=0){
			printf("Estado Solido");
		}
		else if(temp>=1 && temp<=99){
			printf("Estado Liquido");
		}
		else if(temp>=100){
			printf("Estado Gasoso");
		}
		else {
			printf("Codigo Invalido");
		}
		
		return 0;
	}

