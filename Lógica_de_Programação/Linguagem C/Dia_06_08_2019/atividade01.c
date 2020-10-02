#include <stdio.h>

int main(){
	
	int x, cont;
	
	printf("Digite quantas vezes deseja repetir:  ");
		scanf("%i", cont);
		
	for(cont=1; x>=cont; cont++)
		printf("Repetindo %i", x);
	
	
	return 0;
}
