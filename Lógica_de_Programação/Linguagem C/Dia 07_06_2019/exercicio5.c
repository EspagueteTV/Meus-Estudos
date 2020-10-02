#include <stdio.h>
#include <string.h>

int main(){
	
	char letra[60], ultimaletra, c;
	int tamanho, ultimo;

	printf("Digite uma palavra: ");
		gets(letra);
		
	tamanho = strlen(letra);
		ultimo = tamanho-1;
	
	c=letra[ultimo];
	
	
	
	printf("O seu ultimo caractere eh: %c ", c);
	
	return 0;
	
}
