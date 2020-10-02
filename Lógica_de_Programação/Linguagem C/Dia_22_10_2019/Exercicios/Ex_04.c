#include <stdio.h>
#include <string.h>

	int main(){
		
		
		char frase[60];
		int i, espaco, n;
		
		printf("Digite uma frase: ");
			gets(frase);
			
			n = strlen(frase);
		
//		Se a primeira letra for espaço

		if((frase[1] == ' ') == 0){
			espaco = 0;
			for(i=0; i<n; i++){
				if(frase[i] == ' '){
					espaco++;
				}
			}
	}
	
//	Se a primeira letra não for espaço
		if((frase[1] != ' ') == 0){
		for(i=0; i<n; i++){
			
				espaco = 1;
			if(frase[i] == ' '){
				espaco++;
				
				printf("Analisando espaco %d ", espaco);
			}
		}
	}
		printf("A frase possui %d palavras. ", espaco);
		
		
		
		
		
		
		system("pause");
		return 0;
	}
