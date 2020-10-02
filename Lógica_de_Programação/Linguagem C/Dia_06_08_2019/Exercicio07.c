#include <stdio.h>

int main(){
	
	int n_li, cont;
	
	printf("Digite o numero limite de um intervalo: ");
		scanf("%i", &n_li);
	
	for(cont=1; cont<=n_li; cont+=2)
		printf("%i \n", cont);
	
	return 0;
}
