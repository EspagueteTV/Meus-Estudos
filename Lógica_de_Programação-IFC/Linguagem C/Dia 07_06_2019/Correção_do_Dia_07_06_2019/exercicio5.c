#include <stdio.h>
#include <string.h>

int main(){
	
	char texto[60];
	int tam, pos;

	printf("Digite uma palavra: ");
		gets(texto);
		
		tam = strlen(texto);    /* strlen lê o tamanho da string */
			pos = tam-1;
	
	printf("O seu ultimo caractere eh: %c ", texto[pos]);
	
	return 0;
	
}
