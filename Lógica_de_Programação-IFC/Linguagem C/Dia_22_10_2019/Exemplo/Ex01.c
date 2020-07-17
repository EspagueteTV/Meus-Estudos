#include <stdio.h>

	int main(){
		
		char letra = 'A';
		 // printf("Letra = %c", letra);
		
		char nome1[20] = "Joao";
		char nome2[10] = {'J', 'o', 'a', 'o', '\0'};
		char nome3[] = "Joao";
		// printf("\n\nNome = %s", nome3);
		
		printf("\nDigite um nome: ");
			gets(nome1);
		
		
		
		
		int i;
		
		for(i=0; i<20; i++){
			printf("\n %c = %i", nome1[i], nome1[i]);
		}
		
		
		system("pause");
		return 0;
	}
