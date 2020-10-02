#include <stdio.h>

int main(){
	int n, milhar, centena, dezena, unidade;
	
	printf("Digite um valor entre 1000 e 9999: ");
		scanf("%i", &n);
		
		milhar = n/1000;
		centena = ((n%1000)/100);
		dezena = ((n%100)/10);
		unidade = (n%10); 
		
	printf("%i %i %i %i \n", milhar, centena, dezena, unidade);
	
	return 0;
}

