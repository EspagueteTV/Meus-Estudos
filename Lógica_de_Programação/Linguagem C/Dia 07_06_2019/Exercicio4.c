#include <stdio.h>

int main(){
	char letra[10];
	
	printf("Digite um texto:  ");
		gets(letra);
	printf("%.5s", letra);
	
	return 0;
}
