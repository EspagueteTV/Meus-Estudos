//																	Funções para manipulação de strings

#include <stdio.h>
#include <string.h> 

// Biblioteca de funções para manipulação de strings

	int main(){
		
		char str1[20];
		char str2[20];
		
		printf("Digite uma string: ");
			gets(str1);
			
//			Não é possivel atribuir strings com '='
//			str2 = str1;

//		Solução:usar a função strcpy (destino, origem)
		strcpy(str2, str1);
			
		printf("\nstring1 = %s ", str1);
		printf("\nstring2 = %s ", str2);
		
//		Função concatenar: juntar strings strcap(destino, origem)
		strcat(str2, "-");
		strcat(str2, str1);
			printf("\n string 2 = %s", str2);
		
		
//		Função  comparar

		int A = 5;
		int B = 4;
		
		if(A > B){
			printf(" A Maior");
		}
		if( B > A){
			printf(" B Maior");
		}
		if( B == A){
			printf(" A Igual B");
		}
		
		return 0;
	}
