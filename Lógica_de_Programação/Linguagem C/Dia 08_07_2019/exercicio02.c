#include <stdio.h>

int main(){
	
	float a, b, x;
	
	printf("Digite o primeiro intervalo (A):  ");
		scanf("%f", &a);
	printf("Digite o segundo intervalo (B):   ");
		scanf("%f", &b);
	printf("Digite um numero real:  ");
		scanf("%f", &x);
		
	if(x>=a && x<=b){
		printf("x esta no intervalo");
	}
	else{
	printf("x nao esta no intervalo");
	}
	return 0;
}
