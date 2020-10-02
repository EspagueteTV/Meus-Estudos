#include <stdio.h>

int main(){
	
	int x, cont;
	
	printf("Digite quantas vezes deseja repetir:  ");
		scanf("%i", x);
		
	for(cont=1; cont>=x; x++){
		printf("Repetindo %i", x);
	}
	
	
	return 0;
}
