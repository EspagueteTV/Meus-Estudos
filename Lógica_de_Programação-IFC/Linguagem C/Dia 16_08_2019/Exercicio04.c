#include <stdio.h>

	int main(){
		
		int num, cont, mult;
		cont=1;
		
			printf("Digite um numero: ");
				scanf("%i", &num);
				
				while(cont<=10){
					mult= num*cont;
						printf("%i x %i eh: %i \n", num, cont, mult);
							cont++;
				}
				
		return 0;
	}
