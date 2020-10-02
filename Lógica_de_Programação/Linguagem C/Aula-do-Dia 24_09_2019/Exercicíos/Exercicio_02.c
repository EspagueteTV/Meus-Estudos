#include <stdio.h>

	int main(){
		
		int soma=0, cont, v[] = {2,4,6,8,10};
		
		for(cont=0; cont<5; cont++){
			soma= soma+ v[cont];
		}		
		printf("A soma dos valores eh: %i \n", soma);
		
		
		
		
		return 0;
	}
