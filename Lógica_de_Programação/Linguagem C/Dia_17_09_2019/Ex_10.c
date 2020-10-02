#include <stdio.h>

	int main(){
		
		int cont=0;
		float num;
		
		printf("Digite um numero positivo: ");
			scanf("%f", &num);
			
			while(num > 1){
				num/=2;
				cont++;
			}
		printf("O resulatdo da ultima divisão foi: %.2f e foi dividido %i vezes ", num,cont);
		
		return 0;
	}
