//																	Fun��es para manipula��o de strings

#include <stdio.h>
#include <string.h> 

// Biblioteca de fun��es para manipula��o de strings

	int main(){
		
//		Fun��o  comparar strcmp(string1, string2)
//		strcmp(string1, string2) > 0 entao string1 > string 2
//		strcmp(string1, string2) = 0 entao string1 = string2


		char A[5] = "Aba";
		char B[5] = "Aba";
		
		if(strcmp(A, B) > 0){
			printf(" A Maior");
		}
		if(strcmp(A, B) < 0){
			printf(" B Maior");
		}
		if(strcmp(A, B) == 0){
			printf(" A Igual B");
		}
		
//		Fun��o tamanho: conta a quantidade de caracteres 
// 		strlen(str)

		char frase[50];
		printf("\nDigite uma frase: ");
			gets(frase);
		printf("\nVoce digitou %d caracteres ", strlen(frase));	
		
		
		
		return 0;
	}
