#include <stdio.h>

int main(){
	int n, n1, n2, n3, n4;
	
	printf("Digite um numero inteiro entre 1000 e 9999: ");
		scanf("%i", &n);
	
	if((n>1000) && (n<9999)){
			n1= (n/1000);
			n2= ((n%1000)/100);
			n3= ((n%100)/10);
			n4= ((n%10));
				
		printf("%i  %i  %i  %i ",n1, n2, n3, n4);
	}
	else {
		printf("Codigo Invalido");
	}
	return 0;
}
