#include <stdio.h>

int main(){
	
	int x, n, q;
	
	for (x=1; x<=10; x++){
		printf("\n \nDigite um numero: ");
			scanf("%i", &n);
		q=n*n;
		printf("O quadrado de %i eh %i \n ", n, q );
		n=0;
	}
	return 0;
}
