#include <stdio.h>

int main(){
	char letra[11];
	
	printf("Digite um texto:  ");
		gets(letra);
		
		letra[5] = '\0' ; 
		
	printf("%s", letra);



	
	return 0;
}
