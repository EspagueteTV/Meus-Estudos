/* Exercicio 02 Soma Impar e Par */
#include <stdio.h>

	int main(){
		
		int n1, n2, soma;
		
		printf("Digite um numero:  ");
			scanf("%i", &n1);
		printf("\nDigite um numero: ");
			scanf("%i",&n2);
			
			soma = n1 + n2;
			
		if(soma%2==0){
			printf("\nA soma dos numeros eh Par ");
		}
		else{
			printf("\nA soma dos numeros eh Impar ");
		}
		
		return 0;
	}
