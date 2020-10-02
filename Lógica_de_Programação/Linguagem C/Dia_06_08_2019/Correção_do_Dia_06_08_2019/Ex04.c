#include <stdio.h>

	int main(){
		int i, valor, quadrado;
		for(i=0; i<=10; i++){
			printf("digite o valor %i: ",i);
			scanf("%i",& valor);
			quadrado=valor*valor;
			printf("O quadrado de %i eh %i \n",valor, quadrado);
		}
}
