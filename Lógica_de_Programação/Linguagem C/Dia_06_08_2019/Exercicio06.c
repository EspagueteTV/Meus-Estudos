#include <stdio.h>

int main(){
	
	int nota, soma=0, cont;
	float media;
	
	for(cont=1; cont<=10; cont++){
		printf("Digite a Nota %i: ",cont);
			scanf("%i", &nota);
			
		soma= nota + soma;
		nota= 0;
	}
	media= soma/10;
	
	printf("A sua Media foi: %.2f", media);
	
	return 0;
}
