#include <stdio.h>

int main(){
	
	int num, cont, maior, menor;
	
	printf("Digite o Numero 1: ");
		scanf("%i", &num);
	
	maior= num;
	menor= num;
	
	
	
	for(cont=2; cont<=10; cont++){
		printf("Digite o Numero %i: ",cont);
			scanf("%i", &num);
			
		if(num>maior){
			maior= num;
		}
		else if(num<menor){
			menor=num;
		}
	}
	printf("O Maior Numero eh %i e o Menor Numero eh %i", maior, menor);
	
	
	
	return 0;
}
