#include <stdio.h>

	int main(){
		
		int x, y, cont;
		
		printf("Digite um valor para o intervalo 'X':  ");
			scanf("%i",&x);
		printf("Digite um valor para 'Y' que seja maior que o 'X' que eh %i: ", x);
			scanf("%i", &y);
		
		cont=x+1;
		
		
			while(cont<y && cont>x){
				printf("%i \n", cont);
				cont++;
			}
			
				
				
		return 0;
	}
