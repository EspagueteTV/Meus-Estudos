/* Exercicio 05 */
#include <stdio.h>

int main(){
	
	float n1;
	
	printf("Digite um numero: ");
		scanf("%f", &n1);
		
	if(n1<0){
		n1= n1*(-1);
	printf("O seu modulo eh %.2f ", n1);
	}
	else{
		printf("O seu modulo eh %.2f", n1);
	}
	
	return 0;
}
