#include <stdio.h>

	int main(){
		
		int cont, espc_bran = 0;
		char str1[60];
		
		
		printf("Digite uma frase: ");
			gets(str1);
			
		for(cont=0; cont<60; cont++){
			if(str1[cont] == ' '){
				espc_bran++;
			}
		}
		
		printf("A comando ' ' apareceu %d vezes ", espc_bran);
		
		
		
		system("pause");
		return 0;
	}
