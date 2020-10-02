#include <stdio.h>

int main (){
	
	int valor, cont;
	valor = 1;
	cont = 0;
	
	while(valor!=0){
		print("Digite um valor: ");
			scanf("%i", &valor);
			cont= cont + valor;
	}
	printf("A soma eh: %i \n", cont);
	
	return 0;
}
