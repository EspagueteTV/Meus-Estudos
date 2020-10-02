#include <stdio.h>

int main(){
	
	int x, cont;
	
	printf("Digite quantas vezes deseja repetir:  ");
		scanf("%i", &cont);
		
	for(x=1; x<=cont; x++){
		printf("Repetindo %i \n", x);
	}
	
	return 0;
}
